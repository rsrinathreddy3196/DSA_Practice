package Striver.EasyMedium;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsOnce {

    public static int optimal(int[] arr){

        int xor =0;
        for(int n : arr){
            xor^=n;
        }
        return xor;
    }
    public static int appearsOnce(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4,4};
        System.out.println(appearsOnce(arr));
    }
}
