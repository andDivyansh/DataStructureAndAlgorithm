package arrays;

public class SecondLargestNumberInArray {

    // Naive approach to get the second largest number
    public static int secondLargest(int[] arr){
        if(arr.length == 1){
            return 0;
        }

        // First find the largest number in Array
        int largestNumberIndex = 0;
        for(int index = 1; index < arr.length; index++){
            if(arr[index] > arr[largestNumberIndex]){
                largestNumberIndex = index;
            }
        }

        // get the second largest number
        // assign the value as -1 if there is not second largest element
        // consider this use case {5,5,5,5}
        int secondLargestIndex = -1;
        for(int secondIndex = 0; secondIndex< arr.length; secondIndex++){

            if(arr[secondIndex] != arr[largestNumberIndex]){
                if( secondLargestIndex == -1){
                    secondLargestIndex =  secondIndex;
                } else if( arr[ secondIndex] > arr[secondLargestIndex]){
                    secondLargestIndex = secondIndex;
                }
            }
        }

        return secondLargestIndex;
    }


    public static int secondLargestOneTraversal(int[] array){

        if(array.length == 1){
            return 0;
        }

        //{3,1,6,9,15}
        int largestElement = 0, secondLargestElement = -1;
        for(int index= 1; index < array.length; index++){
            if(array[index] > array[largestElement]){
                secondLargestElement = largestElement;
                largestElement = index;
            }
            else if(array[index] != array[largestElement]){
                if( secondLargestElement == -1 || array[index] > array[secondLargestElement]){
                    secondLargestElement = index;
                }
            }
        }

        return secondLargestElement;
    }

    public static void main(String[] args) {
        int[] array =  {2,11,10,19,16};
        int secondLargestIndex =  secondLargest(array);
        System.out.println("Second largest element in the array "+ array[secondLargestIndex] );
    }

}

