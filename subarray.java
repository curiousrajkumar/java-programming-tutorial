public class subarray {
    
public static void sub(int num[]){

int tsa=0;

    for(int i=0;i<num.length;i++){
        for(int j=i; j<num.length;j++){
            for(int k=i ;k<=j;k++){
                System.out.print(num[k]+" ");
               
            }
             tsa++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subarrays = "+tsa);
}





    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        sub(num);

    }
}
