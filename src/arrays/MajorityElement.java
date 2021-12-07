package arrays;

import util.Util;

public class MajorityElement {

    // Naive Solution time complexity is O(n2).
    public static int majorityElement(int[] arr){
        int majorityElementIndex = 0;

        for (int index = 0; index < arr.length; index++){
            int count = 1;
            for( int j = 1 ; j < arr.length; j++){
                if(arr[index] == arr[j]){
                    count ++;
                    majorityElementIndex = j;
                }
            }
            if(count <= arr.length/2){
                majorityElementIndex = -1;
            }
        }
        return majorityElementIndex;
    }

    public static int  usingMooresAlgorithm(int[] arr){
        int count = 1;
        int majorityElement = 0;

        // First find the majority element candidate
        for(int i = 1; i < arr.length; i++){
            // if same element is matched to next index , increase the count.
            if(arr[majorityElement] == arr[i]){
                count++;
            } else {
                // different element cancels each others.
                count--;
            }
            // if the count reached to zero means all others items have cancelled each other
            // update the new element index
            // ex. {8,3,4,8,9},here majority element index will come as 4 (last element).
            if(count == 0){
                majorityElement = i;
                count = 1;
            }
        }
        // Now check if the candidate is actually a majority.
        count = 0;
        for (int i=0; i < arr.length; i++){
            if ( arr[majorityElement] == arr[i]){
                count++;
            }
        }
        if (count <= arr.length/2){
            return -1;
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,8,9};
        Util.print(usingMooresAlgorithm(arr));
    }
}
