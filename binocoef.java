public class binocoef {


    public static int factorial(int n){
       int  fact = 1;

       for(int i=1;i<=n;i++){
        fact = fact *i;

       }
       return fact;

    }


public static int bicoef(int n,int r){
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int nmr_fact = factorial(n-r);

     int cal = n_fact/nmr_fact*r_fact;
     return cal;
}



    public static void main(String args[]){
        int result = bicoef(5,2);

System.out.println(result);
    }
    
}
