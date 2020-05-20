package arrays;

public class Aufgabe622B {

    private static int[] mergeArrays(int[] first, int[] second) {
        int[] result;

        for (int i = 0; i < first.length; i++) {
            
        }

        return result;
    }

    public static void main(String[] args) {
        int[] firstArr = { -4, 0, 1, 3, 7, 11, 12, 14, 19, 20 };
        int[] secondArr = { -3, -2, 2, 4, 5, 6, 7, 15, 18, 21 };
    
        int[] allNums = mergeArrays(firstArr, secondArr);

        for (int i = 0; i < allNums.length; i++) {
            System.out.println(allNums[i]);
        }
    }
}