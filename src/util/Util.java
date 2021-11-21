package util;

public class Util {

    public static void printIntArray(int[] arr){
        for (int value : arr) {
            System.out.print(value);
        }
    }


    public static String getIntArray(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }
        return "";
    }

    public static void print(int element) {
        System.out.println(element);
    }
}
