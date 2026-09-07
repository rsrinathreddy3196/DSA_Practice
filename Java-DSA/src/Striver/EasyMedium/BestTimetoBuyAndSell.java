package Striver.EasyMedium;

import java.util.Arrays;

public class BestTimetoBuyAndSell {

    public static int[] bestTimeToBuyAndSellStock1(int []arr){

        int minPrice = arr[0];
        int maxProfit = 0;
        int buyPrice=arr[0];
        int sellPrice=arr[0];

        for(int i=1;i<arr.length;i++){

            int profit = arr[i] -minPrice;
            if(profit>maxProfit){
                maxProfit = profit;
                buyPrice=minPrice;
                sellPrice=arr[i];
            }
            minPrice = Math.min(minPrice,arr[i]);
        }
        return new int[]{buyPrice,sellPrice};
    }

    public static int bestTimeToBuyAndSellStock(int []arr){

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i=1;i<arr.length;i++){

            int profit = arr[i] -minPrice;
            maxProfit = Math.max(profit,maxProfit);
            minPrice = Math.min(minPrice,arr[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={5,10,2,7};
        System.out.println(Arrays.toString(bestTimeToBuyAndSellStock1(arr)));
    }
}
