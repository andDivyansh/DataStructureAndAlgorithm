package arrays;

public class MoveZeroToEnd {

    // Single traversal approach
    // Time complexity is O(n) and auxilary space is O(1).
    public static void moveZerosToEnd(int[] array){

        // count of non zero elements
       int nonZeroElementCount = 0;

       for(int index = 0; index < array.length; index++){
           // if element is non zero
           if(array[index] != 0){
               // swap the elements at index with element at nonZeroElementCount
               // and increase the count
               int temp = array[nonZeroElementCount];
               array[nonZeroElementCount] = array[index];
               array[index] =  temp;
               nonZeroElementCount++;
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {12, 8, 0, 8, 10, 0, 0, 11};
        int[] arr2 = {0, 0, 0, 0, 0, 10};
        int[] arr3 = {10, 20};
        int[] arr4 = {0, 0, 0, 0};
        moveZerosToEnd(arr4);
        for(int i = 0; i< arr4.length; i++){
            System.out.println(arr4[i]);
        }
    }
}
