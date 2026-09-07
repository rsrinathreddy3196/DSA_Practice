package Striver.EasyMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsectiveSequence {

    public static int longestConsecutiveSequenceBetter(int[] arr){
        if(arr.length==0){
            return 0;
        }
        if(arr.length==1){
            return 1;
        }

        Arrays.sort(arr);

        int count=0;
        int lastSmaller =Integer.MIN_VALUE;
        int longest=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmaller){
                count+=1;
                lastSmaller = arr[i];
            }
            else if(lastSmaller!=arr[i]){
                count=1;
                lastSmaller=arr[i];
            }

            longest = Math.max(longest,count);
        }

        return longest;
    }

    public static int optimal(int[] arr){

        Set<Integer> set = new HashSet<>();
        int longest =1;

        for(int n :arr){
            set.add(n);
        }

        for(int s:set){
            if(!(set.contains(s-1))){
                int count=1;
                int x= s;

                while(set.contains(x+1)){
                    x=x+1;
                    count+=1;
                }

                longest = Math.max(longest,count);

            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr ={1,0,1,2};
        System.out.println(optimal(arr));
    }
}
