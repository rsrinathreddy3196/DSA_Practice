package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashCompute {

    public static int secondLargest(int[] arr){

        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];

            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void countOccurences(int[] arr){

        int max=0;
        int min =Integer.MAX_VALUE;

        int minElement =-1;
        int maxElement = -1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>max){
                max = m.getValue();
                maxElement = m.getKey();
            }
            if(m.getValue()<min){
                min = m.getValue();
                minElement = m.getKey();
            }
        }

        System.out.println("Max element -> " + maxElement + " With value " + max);
        System.out.println("Min element -> " + minElement + " With value " + min);
    }

        public static void main(String[] args) {
//
//        int[] arr = {0,-1,-2,-3};
//        countOccurences(arr);

//        int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));

//            int res = secondLargest(arr);
//            System.out.println(res);
        // hash array
        int[] hashArray = new int[13];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];

        // filling array data
        for(int i=0;i<arraySize;i++){
            arr[i] = sc.nextInt();
        }

        // pre-compute hash array
        for (int j : arr) {
            hashArray[j] += 1;
        }

        System.out.println("Enter the number of queries");
        int queries = sc.nextInt();

        for(int i=0;i<queries;i++){
            int number = sc.nextInt();
            System.out.println(number + " appears " + hashArray[number] + " times ");
        }

        sc.close();
    }
}
