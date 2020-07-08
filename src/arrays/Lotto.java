package arrays;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    // method to randomly select an element from 0 to remaining numbers
    // numsLeft refers to the amount of numbers left to be drawn
    private static int drawNumber(int numsLeft) {
        return (int) (Math.random() * numsLeft); // NOSONAR
    }

    // plays a game of lotto
    private static void playLotto() {

        // create an arraylist with numbers 1 to 49 in ascending order
        List<Integer> allNums = new ArrayList<>();

        for (int i = 1; i <= 49; i++) {
            allNums.add(i);
        }

        // create an arraylist containing the drawn numbers
        List<Integer> winningNums = new ArrayList<>();

        // draw 7 numbers from all 49, the last being the "Zusatzzahl"
        // print out all winning numbers after
        for (int i = 0; i < 7; i++) {
            int num = drawNumber(49 - i);
            winningNums.add(num);
            allNums.remove(Integer.valueOf(num));

            if (i < 6) {
                System.out.println("Zahl " + (i+1) + ": " + winningNums.get(i));
            } else {
                System.out.println("Zusatzzahl: " + winningNums.get(i));
            }
        }

    }
    
    public static void main(String[] args) {
        playLotto();
    }
}