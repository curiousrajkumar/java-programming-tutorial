import java.util.Scanner;

public class isPrimeinRange {
    

    public static Boolean prime(int n){
        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }

public static void isPrime(int n){

    for(int i=2;i<=n;i++){
        if(prime(i)){
            System.out.println(i+" ");
        }
    }


}




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range Number ");
          int num = sc.nextInt();
          sc.close();

        isPrime(num);

    }
}
