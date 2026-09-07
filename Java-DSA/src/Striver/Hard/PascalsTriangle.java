package Striver.Hard;


/*
    Three types of questions

    1) Given row and column of pascals triangle find the element present at that row and column
    sol : use nCr formula to solve it

    2) Given row number in pascals triangle print the entire row
    sol: same as first one but we just need to print the res

 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static long findElement(int row, int col){

        row =row-1;
        col=col-1;

        long res=1;

        for(int i=0;i<col;i++){
            res = res * (row-i);
            res = res/(i+1);
        }
        return res;
    }

    public static void printRowElements(int row){
        int res=1;
        System.out.print(res+ " ");
        for(int col=1;col<row;col++){
            res = res * (row-col);
            res = res / col;
            System.out.print(res + " ");
        }
    }

   public static void main(String[] str){

        printRowElements(3);
    }
}