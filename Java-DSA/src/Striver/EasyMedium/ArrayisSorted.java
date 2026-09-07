package Striver.EasyMedium;

public class ArrayisSorted {

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
    public static boolean checkArrayIsSorted(int[] arr){

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        System.out.println(check(arr));
    }
}
