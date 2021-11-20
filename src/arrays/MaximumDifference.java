package arrays;

import util.Util;

// Maximum difference value if arr[j] - arr[i] where j> i
// means get the difference from later index element with the previous element
// ex = {2,3,10,6,4,8,1} here o/p will be 8 (10 - 2).
public class MaximumDifference {

    public static void maxDifference(int[] arr){

        // First pair difference
        int maxValue = arr[1]- arr[0];
        // Consider the min diff will be first element
        int minValue = arr[0];
        for (int index = 1; index < arr.length; index++){
            maxValue =  Math.max(maxValue, arr[index] - minValue);
            minValue = Math.min(minValue, arr[index]);
        }
            Util.print(maxValue);
    }

    public static void main(String[] args) {
        int[] arr = {7,3,10,6,9,8};
        maxDifference(arr);
    }
}
