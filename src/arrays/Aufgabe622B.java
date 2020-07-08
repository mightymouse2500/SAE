package arrays;

import java.util.Arrays;

public class Aufgabe622B {
    // merge two int arrays into one
    private static int[] mergeArrays(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
    
    // order the elements inside of an int array
    private static void orderArray(int[] inputArray) {
        Arrays.sort(inputArray);
    }

    public static void main(String[] args) {
        int[] firstArr = { -4, 0, 1, 3, 7, 11, 12, 14, 19, 20 };
        int[] secondArr = { -3, -2, 2, 4, 5, 6, 7, 15, 18, 21 };
    
        int[] allNums = mergeArrays(firstArr, secondArr);

        orderArray(allNums);

        for (int i : allNums) {
            System.out.println(i);
        }

    }
}