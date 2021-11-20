package arrays;

public class LargestNumberInArray {

    public static int largestNumber(int[] arr){
        if(arr.length == 1){
            return 0;
        }

        int index = 0;
        for(int arrayIndex = 1; arrayIndex < arr.length; arrayIndex++) {
            if(arr[arrayIndex] > arr[index]){
                // get the index of the largest number
                index = arrayIndex;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr =  {23,0,1, 11, 12};
        int largestNumberIndex = largestNumber(arr);
        System.out.println("Largest element in the array is "+ arr[largestNumberIndex]);
    }
}
