package Striver.EasyMedium;

public class MissingNumber {

    public static int missingNumberBruteForce(int[] arr){

        for(int i=0;i<arr.length;i++){

            boolean flag = false;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberBetter(int[] arr){

        int[] hashArray = new int[arr.length+1];

        for(int n:arr){
            hashArray[n]=1;
        }

        for(int i=0;i<hashArray.length;i++){
            if(hashArray[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber(int[] arr){

        int n = arr.length+1;
        int sum1 = (n*(n+1))/2;

        int sum2 =0;

        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }

        return sum1-sum2;
    }

    public static int missingNumberOptimal(int[] arr){
        int XOR1 =0;
        for(int i=0;i<=arr.length;i++){
            XOR1^=i;
        }

        int XOR2 =0;

        for(int i=0;i<arr.length;i++){
            XOR2^=arr[i];
        }

        return XOR1^XOR2;

    }
    public static void main(String[] args) {

        int[] arr = {1,2,0,4,5};
        System.out.println(missingNumberOptimal(arr));
    }
}
