public class diamond {
    


    public static void main(String[] args) {
        int n=5;


        // outer loop 1st half

for(int i=1;i<=n;i++){

//inner looop 1st half
//space
for(int j=1;j<=n-i;j++){
    System.out.print(" ");
}

//stars
for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
}
System.out.println();
}



//2nd half outer loop
for(int i=n;i>=1;i--){

//inner looop 1st half
//space
for(int j=1;j<=n-i;j++){
    System.out.print(" ");
}

//stars
for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
}
System.out.println();




}

    }
}
