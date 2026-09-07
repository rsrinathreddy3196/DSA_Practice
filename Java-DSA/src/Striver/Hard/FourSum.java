package Striver.Hard;

import java.util.*;

public class FourSum {

    public static List<List<Integer>> brute(int[] arr){

        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        int sum = arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==0){
                            List<Integer> quats = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(quats);
                            set.add(quats);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static List<List<Integer>> better(int[] arr){

        Set<List<Integer>> set = new HashSet<>();

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> temSet = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int l= -(arr[i]+arr[j]+arr[k]);
                    if(temSet.contains(l)){
                            List<Integer> quats = Arrays.asList(arr[i],arr[j],arr[k],l);
                            Collections.sort(quats);
                            set.add(quats);
                    }
                    temSet.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> optimal(int[] arr){

        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for(int i=0;i<n-3;i++){

            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){

                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }

                int left=j+1;
                int right=n-1;

                while(left<right){

                    int sum =arr[i]+arr[j]+arr[left]+arr[right];

                    if(sum==0){
                        res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));

                        while(left<right && arr[left]==arr[left+1]){
                            left++;
                        }
                        while(left<right && arr[right]==arr[right-1]){
                            right--;
                        }

                        left++;
                        right--;
                    }else if(sum<0){
                        left++;
                    }else right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={1,0,-1,0,-2,2};
        System.out.println(optimal(arr));
    }
}
