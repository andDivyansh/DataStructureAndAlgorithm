package Mathmetics;

public class FibonacciSeries {

    public static int fabonacci(int number){
        if(number <= 1){
            return number;
        }

        return fabonacci( number -1) + fabonacci( number - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series of number is " + fabonacci(8));
    }
}
