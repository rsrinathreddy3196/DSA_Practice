package Striver.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeSubIntervals {

    public static int[][] brute(int[][] arr){

        int n = arr.length;

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int count=0;

        int[][] ans = new int[n][2];
        for(int i=0;i<n;){

            int start=arr[i][0];
            int end = arr[i][1];

            int j;
            for(j=i+1;j<n && arr[j][0]<=end;j++){
                end=Math.max(end,arr[j][1]);
            }

            ans[count][0]=start;
            ans[count][1]=end;
            count++;

            i=j;
        }

        return Arrays.copyOf(ans,count);
    }
    public static void main(String[] args) {

        int[][] arr ={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(brute(arr)));
    }
}
