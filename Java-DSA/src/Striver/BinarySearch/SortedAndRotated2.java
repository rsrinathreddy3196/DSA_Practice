package Striver.BinarySearch;


public class SortedAndRotated2 {

    public static boolean searchInSortedAndRotated2(int[]arr , int target){

        int n = arr.length;
        int low = 0;
        int high=n-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid]==target){
                return true;
            }

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low+=1;
                high-=1;
                continue;
            }
            else if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr ={3,1,2,3,3,3,3};
        System.out.println(searchInSortedAndRotated2(arr,10));
    }
}
