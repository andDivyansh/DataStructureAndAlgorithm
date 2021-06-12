package Algorithm;

public class PrimeFactors {

    static void printPrimeFactors(int number) {

        if (number <= 1) {
            return;
        }
        // taking out 2 from the iteration
        while (number % 2 == 0) {
            System.out.println(2);
            number = number / 2;
        }

        // taking out 3 from iterations
        while (number % 3 == 0) {
            System.out.println(3);
            number = number / 3;
        }

        for (int i = 5; i * i < number; i = i + 6) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }

            while (number % (i+2) == 0 ){
                System.out.println(i+2);
                number = number / (i+2);
            }
        }
        // 1, 2,3 numbers are handled already so check number is greater than 3
        if( number > 3){
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printPrimeFactors( 27);
    }
}
