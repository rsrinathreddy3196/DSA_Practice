package Striver.EasyMedium;

import java.util.Arrays;

public class Sort012 {

    public static void swap(int[]arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public static void bruteForce(int[] arr){
        Arrays.sort(arr);
    }
    public static void better(int[] arr) {

        int count_of_zeros=0;
        int count_of_ones=0;
        int count_of_two=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count_of_zeros+=1;
            }else if(arr[i]==1){
                count_of_ones+=1;
            }else count_of_two+=1;
        }

        for(int i=0;i<count_of_zeros;i++){
            arr[i]=0;
        }

        for(int i=count_of_zeros;i<count_of_zeros+count_of_ones;i++){
            arr[i]=1;
        }
        for(int i=count_of_zeros+count_of_ones;i<arr.length;i++){
            arr[i]=2;
        }

    }

    public static void optimal(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={0,1,2,1,2,0,2,1};
        optimal(arr);
        System.out.println(Arrays.toString(arr));
    }
}
