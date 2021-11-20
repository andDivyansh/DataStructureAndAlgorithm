package mathmetics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    static void printAllPrimeFactors(int number) {
        Boolean[] boolArray = new Boolean[number + 1];
        Arrays.fill(boolArray, Boolean.TRUE);

        for (int index = 2; index <= number; index++) {
            if (PrimeNumber.isPrime(index)) {
                System.out.println(index);
                for (int j = index * index; j <= number; j = j + index) {
                    boolArray[j] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        printAllPrimeFactors(7);
    }
}
