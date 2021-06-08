package Algorithm;

public class Euclidean {

    //First Approach
    static int greatestCommonDivisor(int firstNumber, int secondNumber) {

        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        }
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }

        return firstNumber;
    }

    // second approach
    static int recursiveGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        System.out.println("firstNumber " + firstNumber + " secondNumber " + secondNumber);
        return recursiveGCD(secondNumber, firstNumber % secondNumber);


    }

    public static void main(String[] args) {

        System.out.println("GCD of two number is " + recursiveGCD(12, 15));

    }
}
