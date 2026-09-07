package Striver.EasyMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {

    public static void rearrangeBySign(int[] arr){

        int size = arr.length/2;

        int[] positiveNumbers = new int[size];
        int[] negativeNumbers = new int[size];
        int index1=0;
        int index2=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>=0){
                positiveNumbers[index1]=arr[i];
                index1++;
            }
            else{
                negativeNumbers[index2]=arr[i];
                index2++;
            }
        }
        index1=0;
        index2=0;

        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                arr[i]=positiveNumbers[index1];
                index1++;
            }
            else{
                arr[i]= negativeNumbers[index2];
                index2++;
            }
        }
    }

    public static int[] optimal(int[] arr){

        int[] arr1 = new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr1[pos]=arr[i];
                pos+=2;
            }
            else{
                arr1[neg]=arr[i];
                neg+=2;
            }
        }

        return arr1;
    }
    public static void main(String[] args) {

        int[] arr ={-8,-12,0,8,-18,6};
        rearrangeBySign(arr);
        System.out.println(Arrays.toString(arr));
    }
}
