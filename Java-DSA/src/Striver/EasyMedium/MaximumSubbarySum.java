package Striver.EasyMedium;

import java.util.Arrays;

public class MaximumSubbarySum {

    public static int maximumSubarraySum(int[] arr){

        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                    curr_sum+=arr[j];
                    maxSum = Math.max(curr_sum,maxSum);
            }
        }
        return maxSum;
    }


    public static int optimal(int[] arr){

        int maxSum=Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0;i<arr.length;i++){

            curr_sum+=arr[i];

            if(curr_sum>maxSum){
                maxSum=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return maxSum;
    }
    public static int[] printArrayOptimal(int[] arr){

        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int end =-1;

        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>maxSum){
                maxSum =sum;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
        }

        int[] res = new int[end-start+1];
        int index=0;
        for(int i=start;i<=end;i++){
            res[index++]=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr ={5,4,-1,7,8};
        System.out.println(Arrays.toString(printArrayOptimal(arr)));
    }
}
