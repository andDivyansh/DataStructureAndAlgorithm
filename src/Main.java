/*
public class Main {
    public static  String solution(int N) {
        case if (num == 0) { return digit * 10; } // -1 if num is negative number else 1 int negative = num / Math.Abs(num); // get the absolute value of given number num = Math.Abs(num); int n = num; // maximum number obtained after inserting digit. int maxVal = int.MinValue; int counter = 0; int position = 1; // count the number of digits in the given number. while (n > 0) { counter++; n = n / 10; } // loop to place digit at every possible position in the number, // and check the obtained value. for (int i = 0; i <= counter; i++) { int newVal = ((num / position) * (position * 10)) + (digit * position) + (num % position); // if new value is greater the maxVal if (newVal * negative > maxVal) { maxVal = newVal * negative; } position = position * 10; } return maxVal; }
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
*/
