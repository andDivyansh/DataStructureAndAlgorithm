package mathmetics;

public class LCMUsingEuclidean {

    static int GCDEuclidean(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return firstNumber;
        return GCDEuclidean(secondNumber, firstNumber % secondNumber);
    }

    static int LCMEuclidean(int firstNumber, int secondNUmber) {
        return (firstNumber * secondNUmber) / GCDEuclidean(firstNumber, secondNUmber);
    }

    public static void main(String[] args) {
        System.out.println(LCMEuclidean(11, 21));
    }

}
