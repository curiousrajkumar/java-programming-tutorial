public class TotalpairsArr {

public static int PairArray(int num[]) {
    int tp=0;
    int current;

    for(int i=0;i<num.length;i++){
        current = num[i];
      for(int j=i+1;j<num.length;j++){
        System.out.println("("+ current+ "," +num[j]+")");
        tp++;
      }

    }

    return tp;
}


    public static void main(String args[]){
        int num[]= {2,5,7,4,2,6,8};

        int ans = PairArray(num);
        System.out.println("total pair in arr are : "+ ans);
    }
    
}
