package problemandsolutions;

public class JosephusProblem {
    public static int josephus(int number, int indexRemoved){
        if(number == 1){
            return 0;
        }
        return (josephus(number -1 , indexRemoved)+ indexRemoved) % number;
    }

    // Circle index start by index 1
    public static int josephusResult(int number, int indexRemoved){
        return josephus(number, indexRemoved) +1;
    }

    public static void main(String[] args) {
        System.out.println("Remaining number is "+ josephusResult(5, 3));
    }
}
