package Striver.BinarySearch;

public class MinInSortedAndRotated {


    public static int minInSortedAndRotated(int[] arr){

        int low=0;
        int high=arr.length-1;
        int min= Integer.MAX_VALUE;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={16,17,18,19,13,14,15};
        System.out.println(minInSortedAndRotated(arr));
    }
}
