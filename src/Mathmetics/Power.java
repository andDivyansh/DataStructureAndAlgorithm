package Mathmetics;

public class Power {

    static int power(int number, int power) {

        int result  = 1;
        while( power > 0){
            // Check the power is odd or even .
            // if it is odd then simply multiply with number.
            if(power % 2 != 0){
                result = result * number;
            }
            // else multiply with the number itself.
            number = number * number;
            // check till the power value becomes 0.
            power = power/2 ;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Number is " + power(2, 9));
    }
}
