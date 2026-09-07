package Striver.EasyMedium;

import java.util.Arrays;

public class LeftRotateByK {

    public static void reverse(int[] arr , int i, int j){

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void leftRotateByK(int[] arr, int k){

        int[] temp = new int[k];
        k = k%arr.length;

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=k;i<arr.length;i++){
            arr[i-k] = arr[i];
        }

        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i] = temp[j];
            j++;
        }
    }

    public static void rotateByK(int[] arr, int k){

        k = k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5}; // 4,5,1,2,3
        rotateByK(arr,11);
        System.out.println(Arrays.toString(arr));
    }
}
