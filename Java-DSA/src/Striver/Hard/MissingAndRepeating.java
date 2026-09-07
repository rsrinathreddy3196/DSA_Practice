package Striver.Hard;

import java.util.Arrays;

public class MissingAndRepeating {

    public static int[] solution1(int[] arr){

        int[] hashArray = new int[arr.length+1];

        int[] res = new int[2];

        int i=0;
        for(int num:arr){
            hashArray[num]+=1;
        }

        for(int j=1;j<hashArray.length;j++){
            if(hashArray[j]>1 || hashArray[j]==0){
                res[i]=j;
                i++;
            }
        }

        return res;
    }

    public static int[] solution2(int[] arr) {

        int n = arr.length;
        int sn= (n * (n+1))/2;
        int s2n = ((n *(n+1)) *(2 * n+1))/6;

        int s =0;
        int s2 =0;

        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+=arr[i]*arr[i];
        }

        int val1 = s-sn; // x-y
        int val2 = s2-s2n; // x2-y2
        val2 = val2/val1;

        int x = (val1+val2)/2;
        int y= x - val1;

        return new int[]{x,y};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(solution2(arr)));
    }
}
