package Striver.EasyMedium;

import java.util.*;

public class Union {

    public static ArrayList<Integer> unionOfTwoArrays2(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0;
        int j=0;

        ArrayList<Integer> res = new ArrayList<>();

        while(i<n1 && j<n2){

            if(arr1[i]<arr2[j]){
                if(res.isEmpty() || res.get(res.size()-1)!=arr1[i]){
                    res.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(res.isEmpty() || res.get(res.size()-1)!=arr2[j]){
                    res.add(arr2[j]);
                }
                j++;
            }
            else if(res.isEmpty() || res.get(res.size()-1)!=arr1[i]){
                res.add(arr1[i]);
                i++;
                j++;
            }

        }

        while (i<n1){
            if(res.isEmpty() || res.get(res.size()-1)!=arr1[i]){
                res.add(arr1[i]);
            }
            i++;
        }
        while (j<n2){
            if(res.isEmpty() || res.get(res.size()-1)!=arr2[j]){
                res.add(arr2[j]);
            }
            j++;
        }

        return res;

    }

    public static int[] unionOfTwoArrays(int[] arr1 , int[] arr2){

//        int[] temp = new int[arr1.length+arr2.length];
        Set<Integer> uniqueData = new TreeSet<>();

        for(int i=0;i<arr1.length;i++){
            uniqueData.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++) {
            uniqueData.add(arr2[i]);
        }
        int[] res = new int[uniqueData.size()];
        int index=0;
        for(int num:uniqueData){
            res[index] = num;
            index++;
        }

        return res;
    }
    public static void main(String[] args) {

        int[] arr1 = {0};
        int[] arr2 = {0};

        ArrayList<Integer> res = unionOfTwoArrays2(arr1,arr2);
        System.out.println(res);
    }
}
