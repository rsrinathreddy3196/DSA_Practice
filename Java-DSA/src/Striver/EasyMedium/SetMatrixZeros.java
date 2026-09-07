package Striver.EasyMedium;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void markColumn(int j, int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    public static void markRow(int i, int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    public static void setZerosBrute(int[][] arr){

        // set -1 in all the rows and columns where you find zero
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    markRow(i,arr);
                    markColumn(j,arr);
                }
            }
        }

        // traverse through the matrix and fill zeros in places of -1
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void setZerosBetter(int[][] arr){

        int[] rows = new int[arr.length]; // to mark row for which zero needs to be filled
        int[] columns = new int[arr.length]; // to mark column for which zero needs to be filled

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==0){
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(rows[i]==1 || columns[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void setMatrixZerosOptimal(int[][] arr){

        int col0=1;

        for(int i=0;i<arr.length;i++){

            if(arr[i][0]==0){
                col0=0;
            }

            for(int j=1;j<arr.length;j++){

                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr.length-1;j>=1;j--){

                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
            if(col0==0){
                arr[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][]arr ={{1,0,1},{1,1,1},{1,0,0}};
        setMatrixZerosOptimal(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
