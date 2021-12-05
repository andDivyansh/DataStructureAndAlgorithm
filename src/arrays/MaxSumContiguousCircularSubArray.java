package arrays;

import util.Util;

public class MaxSumContiguousCircularSubArray {

    // Naive solution , time complexity is O(n2)
    // add the elements from the start of sub array.
    // for ex. arr = {5,-2,3,4}. first add 5,-2. then 5,-2,3 and then 5,-2,3,4.
    // for the next element - add -2,3 and then -2,3,4 and then -2,3,4,5.
    // here result will be 12. {3,4,5}.
    public static int maxSumInCircularSubArray(int[] arr) {
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            int currentMax = arr[i];
            for (int j = 1; j < arr.length; j++) {
                // use modular arithmetic to update the index of the element
                int index = (i + j) % arr.length;
                currentSum += arr[index];
                currentMax = Math.max(currentMax, currentSum);

            }
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    // Approach to solve this problem with time complexity as O(n).
    // First find the maxSum of normal sub array using Kadane's algorithm.
    // then find the maxSum of Circular Sub array. then take the maxSum of these two.
    public static int maxSumEfficientSolution(int[] arr) {
        int normalMaxSum = kadaneAlgorithm(arr);

        // If all the element of the array is negative then maxSum will be the sum of
        // normal sub array.
        if (normalMaxSum < 0) {
            return normalMaxSum;
        }
        int maxSum = 0;
        // use the kadane algorithm to find the min sum of the subarray.
        for (int i = 0; i < arr.length; i++) {
            maxSum += arr[i];
            // invert the array elements to find the min sub array.
            arr[i] = -arr[i];
        }
        int maxCircular = maxSum + kadaneAlgorithm(arr);
        return Math.max(normalMaxSum, maxCircular);
    }


    public static int kadaneAlgorithm(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum, currentSum + arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4};
        Util.print(maxSumEfficientSolution(arr));
    }
}
