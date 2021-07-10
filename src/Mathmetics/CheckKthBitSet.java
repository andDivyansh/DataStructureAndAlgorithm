package Mathmetics;

public class CheckKthBitSet {

    public static void isKthBitSet(int number, int bitNumber) {
        // Move the bit  to the last and check with '&' operator
        // if the last bit is 1 then it returns 1 else returns 0
        if (((number >> (bitNumber - 1)) & 1) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        isKthBitSet(10, 3);
    }
}
