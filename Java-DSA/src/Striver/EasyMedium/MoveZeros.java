package Striver.EasyMedium;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr){

        int index=0;

        int[] nonZeros = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                nonZeros[index++] = arr[i];
            }
        }

        for(int i=0;i<nonZeros.length;i++){
            arr[i]= nonZeros[i];
        }

    }

    public static void moveZerosOptimized(int[] arr){

        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
