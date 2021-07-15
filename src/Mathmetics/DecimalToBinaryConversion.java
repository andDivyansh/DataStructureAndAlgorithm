package Mathmetics;

public class DecimalToBinaryConversion {

    public static void convertDecimalToBinary(int number){
        // print binary where n > 0
        if(number == 0) {
            return;
        }
        // divide the number and print the reminder
        convertDecimalToBinary(number/2);
        // print the conversion from right to left
        System.out.print(number % 2);
    }

    public static void main(String[] args) {
        convertDecimalToBinary(4);
    }
}
