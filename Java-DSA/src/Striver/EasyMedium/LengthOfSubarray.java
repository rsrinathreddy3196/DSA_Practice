package Striver.EasyMedium;

import java.util.HashMap;
import java.util.Map;

public class LengthOfSubarray {

    public static int optimal(int[] arr, int k){

        int left=0;
        int sum=0; int len=0;

        for(int right=0;right<arr.length;right++){

            sum+=arr[right];

            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                len = Math.max(len,right-left+1);
            }
        }
        return len;
    }
    public static int betterApproach(int[] arr, int k){

        Map<Integer,Integer> map = new HashMap<>();
        int longest=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                longest = Math.max(longest,i+1);
            }
            if(map.containsKey(sum-k)){
                int len = i-map.get(sum-k);
                longest = Math.max(longest,len);
            }

            if(!(map.containsKey(sum))){
                map.put(sum,i);
            }

        }
        return longest;

    }

    public static int lengthOfLongestSubArray(int[] arr, int n){

        int max=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum==n){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={15,-2,2,-8,1,7,10,23};
        System.out.println(betterApproach(arr,0));
    }
}
