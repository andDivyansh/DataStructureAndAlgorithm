package arrays;


import util.Util;

public class MaxLengthEvenOddSubArrayContiguous {

    // Naive solution
    // complexity is O(n2).
    public static int maxLength(int[] array){
        int maxLength = 1;
        // If only one element in the array
        if(array.length == 1){
            return maxLength;
        }

        for(int index = 0; index < array.length; index++){
            int currentLength = 1;
            for(int index1 = index+1; index1 < array.length; index1++){
                // if current element is even and previous element is odd or
                // current element is odd and previous element is even then increase the count
                if((array[index1] %2 == 0 && array[index1 -1] %2 != 0 )||
                   (array[index1] %2 != 0 && array[index1 - 1] %2 == 0)){
                    currentLength ++;
                } else {
                    // break this loop
                    break;
                }
                // take the max value
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }

    // Time complexity is O(n).
    public static int maxLengthOfSubArray(int[] array){

        int maxLength = 1;
        if(array.length == 1){
            return maxLength;
        }

        // temp counter
        int current = 1;
        for(int index = 1; index < array.length; index++){
            if((array[index] % 2 == 0 && array[index -1] %2 !=0) ||
               (array[index] %2 !=0 && array[index - 1] %2 ==0)){
                current ++;
                maxLength = Math.max(current, maxLength);
            } else {
                current = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // int this array max length of even odd subarray is 3.
        // (8,3,4) is the subarray
        int[] arr = {5,10,20,8,3,4};
        Util.print(maxLengthOfSubArray(arr));
    }
}
