package string;

public class PalindromeUsingRecursion {

    public static boolean isPalindrome(String inputString, int start, int end) {
        if (start >= end) {
            return true;
        }

        // First check the first and last character if they are different means string is not palindrome
        // then increase the start index by one decrease the last index by 1
        return (inputString.charAt(start) == inputString.charAt(end) &&
                isPalindrome(inputString, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String inputString = "abababa";
        System.out.println("is input string is palindrome " + isPalindrome(inputString, 0, inputString.length() - 1));
    }
}
