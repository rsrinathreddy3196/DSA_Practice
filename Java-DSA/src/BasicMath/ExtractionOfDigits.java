package BasicMath;

public class ExtractionOfDigits {

    public static int countNoOfDigits(int n){

        int counter=0;

        while(n>0){
            counter+=1;
            n = n/10;
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(countNoOfDigits(1231));
    }
}
