package Striver.Hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithXorK {

    public static int bruteForce(int[] arr, int k){

        int count=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int prefixXor=0;
            for(int j=i;j<n;j++){
                prefixXor^=arr[j];
                if(prefixXor==k){
                    count++;
                }
            }
        }

        return count;
    }

    public static int optimal(int[] arr, int k){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixXor=0;
        int count=0;

        for(int num:arr){

            prefixXor^=num;

            if(map.containsKey(prefixXor^k)){
                count+=map.get(prefixXor^k);
            }

            map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr ={5, 6, 7, 8, 9};
        System.out.println(bruteForce(arr,5));
    }
}
