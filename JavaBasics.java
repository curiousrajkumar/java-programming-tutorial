public class JavaBasics {

    public static int factoial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int  bionocoeff(int n,int r){
        int n_fact=factoial(n);
        int r_fact=factoial(r);
        int nmr_fact=factoial(n-r);

       int  biocoeff=n_fact/(r_fact*nmr_fact);
        return biocoeff;
    }

    public static void main(String[] args) {
        int result = bionocoeff(5,2);
        System.out.println("Binomial Coefficient: " + result);
    }


    
}


