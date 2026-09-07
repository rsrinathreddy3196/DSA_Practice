package Striver.BinarySearch;

public class UpperBound {

    public static int upperBound(int[] arr, int target){

        int low=0;
        int high=arr.length-1;
        int ub=arr.length;

        while(low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid]>target){

                ub=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ub;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,13,14,18};
        System.out.println(upperBound(arr,12));
    }
}
