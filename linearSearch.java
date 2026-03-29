public class linearSearch {
    

public static int linear(int num[],int target){


    for(int i=0;i<num.length;i++){
        if(num[i]==target){
            return i;
        }
    }
    return -1;
}



    public static void main(String[] args) {
        int num[]={23,45,67,89,12,34,56};
        int target=12;

        int ans=linear(num,target);

        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+ans);
        }


    }
}
