package Striver.BinarySearch;

public class FloorAndCeil {

    public static int[] floorAndCeil(int[] arr, int target){

        int low= 0;
        int high = arr.length-1;
        int floor = -1;
        int ceil = -1;

        while(low<=high){

            int mid =low + (high-low)/2;

            if(arr[mid]==target){
                floor=mid;
                ceil=mid;
                break;
            }
            else if(arr[mid]<target){
                floor=mid;
                low=mid+1;
            }
            else{
                ceil=mid;
                high=mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {

    }
}
