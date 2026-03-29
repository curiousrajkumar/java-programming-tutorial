public class solid_rhombus {
    

    public static void main(String[] args) {
        int n=12;

for(int i=1; i<=n; i++){

    // print spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }

    // print stars
    for(int j=1; j<=n; j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
} 
