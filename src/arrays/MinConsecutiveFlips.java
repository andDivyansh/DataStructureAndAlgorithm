package arrays;

// I/p = {1,1,0,0,0,1,1} , O/P = from 2 to 4
// in the above example all zero group should be flipped to make the elements same in the array.
// Fact is mid difference between the flips will be always 1 or 0. for the above example 1's group are 2
// and 0's group is one so the difference is 1. another example is {0,0,1,1,1,0,0,1,1,0,1}
// in this example diff is zero - 0's group are 3 and 1's group also 3.
public class MinConsecutiveFlips {

    public static void minFlipsForTheSameElements(int[] array){

        for (int i = 1; i < array.length; i++){
            if(array[i-1] != array[i]){
                if(array[i] != array[0]) {
                    System.out.print("from " + i + " to");
                } else {
                    System.out.print(i-1);
                }
            }
        }

        // Edge case scenario where the last element is not same with the previous one.
        // ex. {0,1,0,1,1,0,1}. last element is not same with the previous one.
        // for the last element it will print last index to last index.
        if( array[array.length-1] != array[0]){
            System.out.println(array.length-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1};
        minFlipsForTheSameElements(arr);
    }

}
