package Striver.EasyMedium;

public class SecondLargest {

    public static int secondLargest(int[] arr){

        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];

            }
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr ={8,12,1,2,6,5,8,13};
        System.out.println(secondLargest(arr));
    }
}
