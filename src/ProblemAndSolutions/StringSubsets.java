package ProblemAndSolutions;


public class StringSubsets {

    //Power set of any string is pow(2,n) where n is the length of the string
    public static void generateSubset(String inputString, String currentString, int index) {
        if (inputString.length() == index) {
            System.out.println(currentString);
            return;
        }
       // Recursion graph for the string "ABC" is
       //             current string = ""
       //                 /               \  - Length 1
       //               ""                "A"
       //             /     \           /    \
       //            ""    "B"        "A"     "AB"  - Length 2
       //           /  \   /  \      /  \     /   \
       //          "" "C" "B" "BC" "A"  "AC" "AB" "ABC" - Length 3
        generateSubset(inputString, currentString + inputString.charAt(index), index + 1);
        generateSubset(inputString, currentString, index + 1);

    }


    public static void main(String[] args) {
        String str = "ab";
        generateSubset(str, "", 0);
    }
}
