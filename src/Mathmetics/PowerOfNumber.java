package Mathmetics;

public class PowerOfNumber {

    public static boolean isPowerOfTheNumber(int number, int powerNumber){
        if (powerNumber == 0 ){
            return false;
        }
        while (powerNumber != 1){
            if(powerNumber % number != 0){
                return false;
            }
           powerNumber = powerNumber/number;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Check the number is power of " + isPowerOfTheNumber(4,16));
    }
}
