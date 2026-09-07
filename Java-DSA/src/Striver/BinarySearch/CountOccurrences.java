package Striver.BinarySearch;

public class CountOccurrences {

    public int countOccurences(int[] arr, int target){

        int low=0;
        int high =arr.length-1;

        int firstOccurrence=-1;
        int lastOccurrence=-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid]==target){
                firstOccurrence=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }

        low =0;
        high=arr.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid]==target){
                lastOccurrence=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        if(firstOccurrence==-1){
            return 0;
        }

        return (lastOccurrence-firstOccurrence)+1;
    }
}
