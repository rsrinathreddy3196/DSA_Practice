package Striver.BinarySearch;

public class BinarySearch {

    public static int binarySearchAlgo(int[] arr, int target){

        int low=0;
        int high = arr.length-1;
        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int low , int high , int target){

        if(low>high){
            return -1;
        }
        int mid =(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }else if(target>arr[mid]){
            return binarySearchRecursive(arr,mid+1,high,target);
        }
        return binarySearchRecursive(arr,low,mid-1,target);
    }
    public static void main(String[] args) {
        int[] arr = {3,8,10,12,17,20};

        System.out.println(binarySearchRecursive(arr,0,arr.length-1,12));
    }
}
