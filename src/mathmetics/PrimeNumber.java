package mathmetics;

public class PrimeNumber {

    static boolean isPrime(int number) {
        boolean isPrimeNumber = true;

        // 1 is not Prime nor Composite number
        if (number == 1)
            isPrimeNumber = false;

        // 2, 3 is considered as Prime number
        if (number == 2 || number == 3)
            isPrimeNumber = true;

        // most of the number are divided by 2 and 3,
        // this condition is helpful to reduce the iteration.
        if (number % 2 == 0 || number % 3 == 0) {
            isPrimeNumber = false;
        }

        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                isPrimeNumber = false;
        }
        return isPrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println("Is Number Prime " + isPrime(1031));
    }
}
