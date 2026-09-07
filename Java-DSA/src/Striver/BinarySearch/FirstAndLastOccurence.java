package Striver.BinarySearch;

public class FirstAndLastOccurence {

    public int lowerBound(int[] arr, int target){

        int low =0;
        int high =arr.length-1;
        int lb=arr.length;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid]>=target){
                lb=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return lb;
    }

    public int upperBound(int[] arr, int target){

        int low=0;
        int high=arr.length-1;
        int ub=arr.length;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid]>target){
                ub=mid;
                high=mid-1;
            }
            else low = mid+1;
        }

        return ub;
    }
    public int[] searchRange(int[] nums, int target) {

        int lb = lowerBound(nums,target);

        if(lb==nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
        }

        int ub = upperBound(nums,target);

        return new int[]{lb,ub-1};
    }

    public int[] firstAndLastOccurence(int[] arr, int target){

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

        return new int[]{firstOccurrence,lastOccurrence};
    }
}
