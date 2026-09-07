package Striver.EasyMedium;

import java.util.Arrays;

public class NextPermutation {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void findNextPermutation(int[] arr){

        int pivotElement =-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivotElement=i;
                break;
            }
        }
        if(!(pivotElement==-1)){
            for(int i=n-1;i>pivotElement;i--){
                if(arr[i]>arr[pivotElement]){
                    swap(arr,i,pivotElement);
                    break;
                }
            }
        }
        int i=pivotElement+1;
        int j=n-1;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr ={3,2,1};
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
