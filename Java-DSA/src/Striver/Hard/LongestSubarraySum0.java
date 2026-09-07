package Striver.Hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySum0 {

    public static int longestSubarraySum0(int[] arr){

        int longest=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    longest=Math.max(longest,j-i+1);
                }
            }
        }

        return longest;
    }

    public static int optimal(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        int longest=0;
        int prefixSum=0;

        for(int i=0;i<arr.length;i++){

            prefixSum+=arr[i];

            if(prefixSum==0){
                longest = Math.max(longest,i+1);
            }

            if(map.containsKey(prefixSum)){
                int len=i-map.get(prefixSum);
                longest=Math.max(longest,len);
            }else{
                map.put(prefixSum,i);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        int[] arr ={15,-2,2,-8,1,7,10,23};
        System.out.println(optimal(arr));
    }
}
