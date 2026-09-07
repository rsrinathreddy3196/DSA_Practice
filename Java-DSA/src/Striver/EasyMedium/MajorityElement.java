package Striver.EasyMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

    public static int brute(int[] arr){

        int res = arr.length/2;

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count>res){
                return arr[i];
            }
        }

        return -1;
    }

    public static int better(int[] arr){

        int res =arr.length/2;
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>res){
                return m.getKey();
            }
        }

        return -1;
    }

    public static int optimal(int[] nums){
        int ele=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                ele = nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }
            else count--;
        }
        int res=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==ele){
                res++;
            }
            if(res>nums.length/2){
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2};
        System.out.println(optimal(arr));
    }
}
