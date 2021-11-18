package Arrays;

public class RemoveDuplicatesSortedArray {

    // Naive approach
    // create one temp array and find the distinct elements in the array
    // and copied the temp array into the actual array
    // time complexity is O(n) and auxilary space also O(n) because of the temp array created of the size n.
    public static int removeDuplicates(int[] array, int size){
        int[] tempArray = new int[size];

        // initialise with the first element
        tempArray[0] = array[0];
        int newSize = 1;
        for(int index = 1; index< array.length; index++){
            // check if the element are distinct
            if(array[index -1] != array[index]){
                tempArray[index] =  array[index];
                // increase the array size
                newSize++;
            }
        }
        // copy the temp array to the new array
        System.arraycopy(tempArray, 0, array, 0, tempArray.length);
        return newSize;
    }

    // Efficient approach
    // time complexity is O(n) and auxilary space also O(1).
    public static int removeDuplicatesInSortedArray(int[] array){
        int newSize =  1;
        for(int index = 1; index < array.length; index++){
            if(array[index]  != array[newSize - 1]){
                array[newSize] = array[index];
                newSize++;
            }
        }
        return newSize;
    }

    public static void main(String[] args) {
        int[] arr = {12, 12,13,13,14,15};
       // System.out.println("new array size"+ removeDuplicates(arr, arr.length));
        System.out.println("new array size is "+ removeDuplicatesInSortedArray(arr));
    }
}
