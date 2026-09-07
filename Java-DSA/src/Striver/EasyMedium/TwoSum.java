package Striver.EasyMedium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBetter(int[] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int compliment = target-arr[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{};
    }

    public static int[] twoSumOptimal(int[] arr, int target){

        int i=0;
        int j = arr.length-1;

        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                return new int[]{i,j};
            }
            else if(sum>target){
                j--;
            }
            else i++;
        }

        return new int[]{};
    }
    public static void main(String[] args){

    }
}
