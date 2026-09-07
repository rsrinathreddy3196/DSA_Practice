package Striver.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

    public static List<Integer> better(int[] arr){

        Map<Integer,Integer> res = new HashMap<>();
        List<Integer> resList = new ArrayList<>();
        for(int num:arr){
            res.put(num,res.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> map:res.entrySet()){
            if(map.getValue()>arr.length/3){
                resList.add(map.getKey());
            }
        }

        return resList;
    }
    public static List<Integer> majorityElements(int[] arr) {

        int candidate1 = 0;
        int candidate2 = 0;

        List<Integer> ans = new ArrayList<>();
        int votes1 = 0;
        int votes2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == candidate1) {
                votes1++;
            } else if (arr[i] == candidate2) {
                votes2++;
            } else if (votes1 == 0) {
                votes1 = 1;
                candidate1 = arr[i];
            } else if (votes2 == 0) {
                votes2 = 1;
                candidate2 = arr[i];
            } else {
                votes1--;
                votes2--;
            }
        }

        votes1 = 0;
        votes2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                votes1++;
            } else if (num == candidate2) {
                votes2++;
            }
        }

        if (votes1 > arr.length / 3) {
            ans.add(candidate1);
        }
        if (votes2 > arr.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}
