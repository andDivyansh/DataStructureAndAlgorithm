package Mathmetics;

// XOR (^) operator has many functionalities
// x ^ 0 = x, x^y = y^x , x^(y^z) = (x^y)^z
public class OneOddOccurrenceOfNumber {
    //add one by one element of the array using xor operator
    public static int findOddNumberOccurrences(int arr[]) {
        int result = 0;
        for (int index = 0; index < arr.length; index++) {
            result = result ^ arr[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 2, 1};
        System.out.println("Odd Occurence Number is " + findOddNumberOccurrences(arr));
    }
}
