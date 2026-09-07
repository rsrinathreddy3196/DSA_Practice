package Striver.EasyMedium;

import com.sun.org.apache.xml.internal.utils.Trie;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicatesBruteForce(int[] arr){

        Set<Integer> set = new TreeSet<>();

        for(int n:arr){
            set.add(n);
        }

        int index=0;
        for(int n:set){
            arr[index++] = n;
        }

        return index;
    }
    public static int removeDuplicates(int[] nums) {

        int j=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        int count = removeDuplicates(nums);

        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(21);
        set.add(97);
        set.add(92);
        System.out.println(set);
//        System.out.println(count);
    }
}
