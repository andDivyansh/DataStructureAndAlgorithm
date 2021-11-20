package arrays;

public class MissingNumberInArray {

    public static int findMissingNumber(int arr[]) {
        int xorResult =  0;
        // First take the xor of all numbers equals to size of the array.
        for (int index = 1; index <= (arr.length +1); index++) {
            xorResult = xorResult ^ index;
        }

        // xor all the elements off the array
        for (int secondIndex = 0; secondIndex < arr.length; secondIndex++){
            xorResult =  xorResult ^ arr[secondIndex];
        }
        return xorResult;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 5};
        System.out.println("Missing number in array is " + findMissingNumber(arr));
    }
}
