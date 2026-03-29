public class isbinary {

public static void isBinary(int binNum){
    int myNum= binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
        int lastDigit=binNum%10;
        decNum=decNum+lastDigit*(int)Math.pow(2,pow);
        pow++;
        binNum=binNum/10;
    }
   System.out.println("Binary: " + myNum + " Decimal: " + decNum);
}

public static void main(String args[]){
   isBinary(101);
}
}
