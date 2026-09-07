package Striver.EasyMedium;

import java.util.Arrays;

public class ProductOfArrayItself {

    public static int[] productOfArray(int[] arr){

        int[] ans = new int[arr.length];

        int leftProduct=1;
        for(int i=0;i<arr.length;i++){
            ans[i]=leftProduct;
            leftProduct*=arr[i];
        }

        int rightProduct=1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]*=rightProduct;
            rightProduct*=arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(Arrays.toString(productOfArray(arr)));
    }
}
