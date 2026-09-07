package BasicMath;

public class AmstrongNumber {

    public static boolean isArmstrongNum(int n){

        int sum =0;
        int original=n;
        int real = original;
        int countofDigits=0;
        while(n>0){
            countofDigits+=1;
            n = n/10;
        }
        while(original>0){

            int rem = original%10;
            sum = sum + (int)Math.pow(rem,countofDigits);
            original =original/10;
        }

        return real==sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(163));
    }
}
