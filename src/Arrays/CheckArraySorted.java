package Arrays;

public class CheckArraySorted {

    // Considering array is sorted in ascending order only
    // Naive approach (Time complexity is O(n2))
    public static boolean isArraySorted(int[] arr){

        for(int firstIndex = 0; firstIndex< arr.length; firstIndex++){
            for(int secondIndex = firstIndex+1; secondIndex < arr.length; secondIndex++ ){
                if(arr[firstIndex] > arr[secondIndex])
                    return false;
            }
        }
        return true;
    }

    // Comparing the elements with previous element
    public static boolean isArraySortedOneTraversal(int[] array){
        for(int index = 1; index < array.length; index++){
            if(array[index] < array[index - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,8,9};
        System.out.println("Is array sorted "+ isArraySortedOneTraversal(arr));
    }
}
