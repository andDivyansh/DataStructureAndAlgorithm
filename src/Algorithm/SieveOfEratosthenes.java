package Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SieveOfEratosthenes {

    static void printAllPrimeFactors(int number) {
        Boolean[] boolArray = new Boolean[number + 1];
        Arrays.fill(boolArray, Boolean.TRUE);

        for (int index = 2; index * index < number; index++) {
            if (PrimeNumber.isPrime(index)) {
                boolArray[index] = false;
            }
        }

        for (int i = 1; i < number; i++) {
            if (boolArray[i] = false) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printAllPrimeFactors(20);
    }
}
