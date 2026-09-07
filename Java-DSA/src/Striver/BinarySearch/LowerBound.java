package Striver.BinarySearch;

public class LowerBound {

    public static int lowerBound(int[] arr, int target){

        int low=0;
        int high=arr.length-1;
        int lb=arr.length;

        while(low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid]>=target){

                lb=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return lb;
    }
    public static void main(String[] args) {

    }
}
