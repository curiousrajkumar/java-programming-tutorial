public class invertedpymd {
    

    public static void inverted_pyramid(int n){
        //outer loop for rows

        
         for(int i=1;i<=n;i++){
            //inner loop for spaces
            for(int j=1; j<=n-i; j++){  
                System.out.print("  "); 

            }

            //inner loop for stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }

    public static void main(String args[]){
        inverted_pyramid(4);
        

    }
}
