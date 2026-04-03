
// import java.util.*;

public class bigAndSmallNum {


    public static int compNum(int num[]){
        int largest =Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            
            if(largest <  num[i]){
                largest = num[i];
            }

            if(smallest > num[i]){
                smallest= num[i];
            }


        }
System.out.println("smallest is:"+ smallest);
        return largest;
    }

    public static void main(String args[]){
        int num[] = {2,1,5,4,6,9};

        int lg= compNum(num);
        System.out.println("lagest number is:" + lg);
    }
    
}
