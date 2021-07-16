package Mathmetics;

public class SumOfNaturalNumbers {
    // First Approach using tail recursion
    public static int sumOfNumbers(int number, int sum) {
        if (number <= 1) {
            return sum;
        }
        return sumOfNumbers(number - 1, sum + number);
    }

    // Second approach using sum of natural numbers formula
    public static int sumOfNumbersUsingFormula(int number) {
        return number * ((number + 1) / 2);
    }


    public static void main(String[] args) {
        System.out.println("Sum of numbers is " + sumOfNumbersUsingFormula(5));
    }
}
