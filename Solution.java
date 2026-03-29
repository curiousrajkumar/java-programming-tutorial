import java.util.*;




public class Solution{




    public static void main(String args[]){

        while(true){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
         int palindrome= sc.nextInt();
            sc.close();

         
       if(palindrome==1){
        break;
       }



        

         if(ispalindrome(palindrome)){
            System.out.println("palindrome");
         }
            else{
                System.out.println("not palindrome");
            }
        }

        }

    
    public static boolean ispalindrome(int n){
    int palindrome =n;
    int reverse=0;

while(palindrome !=0 ){
   int  lastdigit= palindrome%10;
    reverse=reverse*10 + lastdigit;
    palindrome=palindrome/10;
    
}

if(n==reverse){
    return true;
}
else{
    return false;

    }

}

}