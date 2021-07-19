package Mathmetics;

public class SumOfNumbersRecursion {

    // Recursive approach
    public static int sumOfNumbers(int numbers){
        if (numbers <= 9){
            return numbers;
        }
        return sumOfNumbers(numbers/10) + numbers %10;
    }

    // Non Recursive approach
    public static int sumOfNumbersIterative(int numbers){
        int sum = 0;
        while (numbers != 0){
            sum = sum + (numbers %10);
            numbers = numbers/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of number is  "+sumOfNumbersIterative(7999));
    }
}
