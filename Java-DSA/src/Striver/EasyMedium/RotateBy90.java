package Striver.EasyMedium;

import java.util.Arrays;

public class RotateBy90 {

    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i] = temp;
    }
    public static int[][] rotateBy90Brute(int[][] arr){

        int[][] arr1 = new int[arr.length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr1[j][arr.length-i-1]=arr[i][j];
            }
        }

        return arr1;
    }

    public static void rotateBy90Optimal(int[][] arr){
        int n = arr.length;

        // matrix transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(arr,i,j);
            }
        }

        // reverse every row
        for(int i=0;i<arr.length;i++){
           int left=0; int right = arr.length-1;

           while(left<right){
               int temp = arr[i][left];
               arr[i][left]=arr[i][right];
               arr[i][right]=temp;
               left++;
               right--;
           }
        }

    }
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateBy90Optimal(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
