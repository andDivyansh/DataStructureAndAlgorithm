package arrays;

public class RotateAnArrayAnyPlaces {

    //Efficient Approach
    // Rotate an array by n number of rotation
    // Time complexity is O(n) and space is 0(1).
    // Ex. arr = {1,2,3,4,5}
    public static void rotateAnArrayByAnyPlaces(int[] array, int rotationNumber){

        // so o/p should be arr = {3,4,5,1,2}
        // First reverse the array be rotation-1
        // o/p is arr = { 2,1,3,4,5}
        reverseAnArray(array, 0, rotationNumber-1);

        // now reverse the array from rotation index to array length
        // o/p is arr = {2,1,5,4,3}
        reverseAnArray(array, rotationNumber, array.length-1);

        // now reverse the entire array
        // o/p is arr = {3,,4,5,1,2}
        reverseAnArray(array, 0, array.length -1 );

    }

    private static void reverseAnArray(int[] arr, int firstIndex, int lastIndex ){
        while (firstIndex < lastIndex){
            int temp =  arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateAnArrayByAnyPlaces(arr, 4);
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
