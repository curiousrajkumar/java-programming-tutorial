
import java.util.*;

public class deciTobinary {
    public static void convertToBinary(int n){
int myNum =n;
int pow=0;
int dec=0;

while(n>0){
    int lg=n%10;
    dec = dec + lg*(int)Math.pow(2,pow);
    pow++;
    n=n/10;
}

System.out.println("binary: " + myNum + " decimal: " + dec);
    }





    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();

        convertToBinary(n);
    }
}
