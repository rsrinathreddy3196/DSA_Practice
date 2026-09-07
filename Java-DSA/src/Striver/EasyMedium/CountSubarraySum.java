package Striver.EasyMedium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum {

    public static int countSubarraySum(int[] arr, int k){

        int count=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;
    }

    public static int optimal(int[] arr, int k){

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
       int count=0;
       int prefixSum=0;

       for(int num:arr){
           prefixSum+=num;

           if(map.containsKey(prefixSum-k)){
               count+=map.get(prefixSum-k);
           }

           map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

       }

       return count;

    }
    public static void main(String[] args) {
        int[] arr ={-1,-1,1};
        System.out.println(countSubarraySum(arr,0));
    }
}
