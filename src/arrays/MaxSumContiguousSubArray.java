package arrays;

import util.Util;

public class MaxSumContiguousSubArray {

    public static int maxSum(int[] array){
        // initialise the sum
        int maxSum = array[0];
        // max sum of contiguous subarray would be the element itself or
        for(int index = 1; index< array.length; index++){
            maxSum = Math.max(maxSum+array[index], array[index]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr= {2,3,-8,7,-1,2,3};
        int[] arr2 = {2,3,9};
        Util.print(maxSum(arr2));

    }
}
