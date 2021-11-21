package arrays;

import util.Util;

public class MaxConsecutiveOnes {

    public static int maxCount(int[] arr){
        int maxConsecutiveOnes = 0;
        int count  = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == 0){
                count = 0;
            } else {
                count++;
                maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);
            }
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1};
        Util.print(maxCount(arr));
    }
}
