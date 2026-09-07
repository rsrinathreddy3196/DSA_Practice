package Striver.EasyMedium;

public class ConsecutiveOnes {

    public static int consecutiveOnes(int[] arr){

        int max=0;
        int count_of_ones=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count_of_ones+=1;
                max = Math.max(count_of_ones,max);
            }
            else count_of_ones=0;
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr={1,1,0,1,1,1};
        System.out.println(consecutiveOnes(arr));
    }
}
