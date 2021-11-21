package arrays;

import util.Util;

public class TrapRainWater {

    // Never consider the left most element and right most element.
    // because water will not be collected in those element.
    public static int trapWater(int[] array){
        int size = array.length -1 ;
        int trappedWaterUnit = 0;
        //   calculate  the element for both of the sides
        int[] leftSideMax = new int[array.length];
        int[] rightSideMax =  new int[array.length];

        // initialise the arrays
        leftSideMax[0] = array[0];
        rightSideMax[size] = array[size];

        for (int index = size - 1; index >= 0; index--){
            rightSideMax[index] = Math.max(array[index], rightSideMax[index + 1]);
        }
        System.out.println("Right Side Max Array is "+Util.getIntArray(rightSideMax));

        for (int index = 1; index < size ; index++){
            leftSideMax[index] = Math.max(array[index], leftSideMax[index - 1]);
        }
        System.out.println("Left Side Max Array is "+Util.getIntArray(leftSideMax));

        // find the min value for the middle elements
        for (int index = 1; index < size ; index++){
            trappedWaterUnit = trappedWaterUnit + (Math.min(leftSideMax[index], rightSideMax[index]) - array[index]);
        }

        return trappedWaterUnit;
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 2, 5};
        Util.print(trapWater(arr));
    }
}
