package Mathmetics;

public class Factorial {
    // First option
    // Non tail recursive call because here compiler has to perform multiplication
    public static int fact(int number){
        if( number == 0 || number == 1){
            return 1;
        }

        return number * fact( number -1);
    }

    // Second Option
    // This function is tail recursive
    public static int factTailRecursive(int number, int factorial){
        if( number == 0 || number == 1){
                return factorial;
        }

        return factTailRecursive(number -1 , factorial * number);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of number is "  + factTailRecursive(5, 1));
    }
}
