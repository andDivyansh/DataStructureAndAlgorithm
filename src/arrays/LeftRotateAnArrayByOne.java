package arrays;

// Left rotation means rotate the array anti clock wise
// left rotate the array by one means only one element will b rotated in the array.
// ex I/P =  {2,3,4,5}    O/P = {3,4,5,2}
public class LeftRotateAnArrayByOne {

    public static void leftRotateByOne(int[] array){
        // copy the first element value
        int firstElement = array[0];

        for (int index = 1; index < array.length; index++){
            array[index-1] = array[index];
        }
        array[array.length -1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotateByOne(arr);
        for (int i= 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
