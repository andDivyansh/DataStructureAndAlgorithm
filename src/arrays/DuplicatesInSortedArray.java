package arrays;

import util.Util;

public class DuplicatesInSortedArray {

    public static void numberOfDuplicatesInSortedArray(int[] array){

        int index = 1;
        int duplicatesCount = 1;

        while(index < array.length){

            while ( index < array .length && array[index -1] == array[index]){
                duplicatesCount ++;
                index ++;
            }
            System.out.println("array element "+array[index -1]+ " count "+ duplicatesCount );
            index++;
            // setting count to one for the next element
            duplicatesCount = 1;
        }

        // I array length is 1
        // and if the last element occurrence is only one.
        if(array.length == 1 || array[array.length -1 ] != array[array.length -2]){
            System.out.println("array element "+array[index -1]+ " count "+ 1 );
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30};
        numberOfDuplicatesInSortedArray(arr);
    }
}
