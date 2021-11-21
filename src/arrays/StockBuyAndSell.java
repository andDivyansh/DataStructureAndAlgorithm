package arrays;

import util.Util;

public class StockBuyAndSell {

    public static int maxProfitBuyAndSell(int[] array){

        int profit = 0;
        for (int index= 1; index < array.length; index++){
            if(array[index ] > array[index - 1]){
                profit += array[index] - array[index -1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,8,12};
        Util.print(maxProfitBuyAndSell(arr) );
    }

}
