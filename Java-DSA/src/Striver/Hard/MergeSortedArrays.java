package Striver.Hard;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void optimalLeetcode(int[] arr1, int m, int[] arr2, int n){

        int i=m-1;
        int j=n-1;

        int k=m+n-1;

        while(j>=0){

            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;
        }
    }
    public static void swap(int[] arr1, int[]arr2 , int left, int right){
        int temp=arr1[left];
        arr1[left]=arr2[right];
        arr2[right]=temp;
    }
    public static void mergeSortedArrays(int[] arr1, int n, int[] arr2, int m){

        int left = n-1;
        int right=0;

        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                swap(arr1,arr2,left,right);
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int left=m-1;
        int right=0;

        while(left>=0 && right<n){
            if(nums1[left]>nums2[right]){
                swap(nums1,nums2,left,right);
                left--;
                right++;
            }else{
                break;
            }
        }

        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);

        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
    }

    public static void optimal(int[] arr1, int m, int[] arr2, int n) {

        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                if (left < m && right >= m) {
                    if (arr1[left] > arr2[right - m]) {
                        swap(arr1, arr2, left, right - m);
                    }
                } else if (left >= m) {
                    if (arr2[left - m] > arr2[right - m]) {
                        swap(arr2, arr2, left - m, right - m);
                    }
                } else {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, arr1, left, right);
                    }
                }

                left++;
                right++; // Fix 1: Slide the right pointer forward
            }

            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2);
        }

        // Fix 2: Iterate up to 'n' to copy all elements of arr2
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }
    }
    public static void main(String[] args){
        int[] arr1 ={1,2,3,0,0,0};
        int []arr2={2,5,8};

        optimalLeetcode(arr1,3,arr2, arr2.length);

        System.out.println(Arrays.toString(arr1));

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }
}
