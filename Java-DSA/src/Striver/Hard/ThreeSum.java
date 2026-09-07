package Striver.Hard;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> brute(int[] arr){

        Set<List<Integer>> set = new HashSet<>();

        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        List<Integer> triplet = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
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
            Set<Integer> tempSet = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k = -(arr[i]+arr[j]);
                if(tempSet.contains(k)){
                    List<Integer> triplet = Arrays.asList(arr[i],arr[j],k);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                tempSet.add(arr[j]);
            }
        }

        return new ArrayList<>(set);
    }

    public static List<List<Integer>> optimal(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else right--;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(optimal(arr));
    }
}