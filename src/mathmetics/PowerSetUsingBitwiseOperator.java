package mathmetics;

/* The whole logic is based on Right Shift operator and binary representation of numbers.
    Power set in a string = pow(2,n) where n is the length of the string
    for ex. "abc" = pow(2,3) = 8
    Below is the binary representation of numbers 1 to 7
    so when the bit is set (ie 1) print the character of the string
   Input      | Subset
   000        |  ""
   001        |  "a"
   010        |  "b"
   011        |  "ab"
   100        |  "c"
   101        |  "ca"
   110        |  "cb"
   111        |  "abc"
 */
public class PowerSetUsingBitwiseOperator {
    public static void printPowerSet(String inputString) {
        int length = inputString.length();
        int powerSetOfInputString = (int)Math.pow(2, 3);
         for ( int index = 0; index < powerSetOfInputString; index++){
             for(int secondIndex = 0; secondIndex < length; secondIndex++){
                 if((index & (1 << secondIndex)) != 0) {
                     System.out.println(inputString.charAt(secondIndex));
                 }
             }
         }

    }

    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Power set of Input String are \n");
        printPowerSet(inputString);
    }
}
