package Striver.EasyMedium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static List<Integer> leadersInArrayBrute(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag =true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }

    public static List<Integer> leadersInArrayOptimal(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
               max=arr[i];
               leaders.add(max);
            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr ={10,22,12,3,0,6};
        System.out.println(leadersInArrayOptimal(arr));
    }
}
