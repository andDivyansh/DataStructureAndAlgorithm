package arrays;

public class ReverseAnArray {

    public static void reverseAnArray(int[] array){
        // create 2 pointer , one for start and another one for the last element.
        int startingPointer = 0, endPointer = array.length-1;

        // swap the elements until pointer cross each other
        while (startingPointer < endPointer){
            // swap pointer elements using temp variable
            int temp = array[startingPointer];
            array[startingPointer] = array[endPointer];
            array[endPointer] =  temp;
            // decrease the endPointer value and increase firstPointer value
            endPointer--;
            startingPointer++;
        }
    }

    public static void main(String[] args) {
        int[] arr =  {1, 6,9, 5};
        reverseAnArray(arr);
        for (int index = 0; index< arr.length; index++) {
            System.out.println(""+ arr[index ]);
        }
    }
}
