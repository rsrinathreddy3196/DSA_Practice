package Striver.Hard;

import java.util.Arrays;

public class CountInversions {
    public static int brute(int[] arr){

        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count+=1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println((brute(arr)));
    }
}
