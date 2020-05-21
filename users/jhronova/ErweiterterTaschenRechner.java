package jhronova;

import java.util.Scanner;

public class ErweiterterTaschenRechner {
    // Programm sollte eine einfache REchner  nachmachen aaber mit  methoden von Proyenten yu berechnen
    // Rechen Programm basiert auf der Aufgaben  rechner und aufgabe  Methoden

    public static int countWithLetter(final String inputA) {
        return 12;
    }

    public static int countPercentage(final int a, final int b) {

        int result = 0; //falls sich das nicht gelingt, kriget man eine 0 zuruck;
        try {
            result = (a * 100 / b);

        } catch (final ArithmeticException e) {
            System.out.println("b  darf nicht 0 sein");
        }
        return result;
    }

    public static int loudNumber(final Scanner scanner) {
        String cislo = "";
        boolean startagein = true;
        while (startagein) {
            startagein = false;
            try {
                cislo = scanner.nextLine(); // alle Zeichen
                return Integer.parseInt(cislo); // convert to number
            } catch (final Exception e) {
                System.out.println(" Spatne zadany");
                System.out.println("Fallst du M berechen moechtest druerckt  J falls nein N");
                final String letterYes = scanner.nextLine();

                // String letterNo = keyboard.next();

                if (letterYes.equals("J")) { // in Java muss man Strings nur aufdiese weise vergleichen  sonst ist es immer ungleich/ jestli ten retezec je stejny ale J == J jestli to je uloyenz na stejne
                                             //

                    return countWithLetter(cislo);
                } else {
                    startagein = true;
                }
            }
        }
        return 0; // 

    }

    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        boolean startagein = true;

        while (startagein) {
            startagein = false;
            try {

                System.out.println("Geben Sie  zahl1 eingeben");
                final int inputA = loudNumber(keyboard);

                System.out.println("Geben Sie  item eingeben");
                String item = keyboard.nextLine(); // nur mit next. haette es Enter als neachsteste nummer gelesen  s next nacte enter jako druhe cislo 

                System.out.println("Geben Sie  zahl2 eingeben");
                final int inputB = loudNumber(keyboard); // es ist die Zahl
                // try it
                // items ducrchlaufen lassen, welche ich benutzen m;chte
                boolean startagein2 = false; // Angabe der neuen Operation

                do {
                    startagein2 = false;
                    switch (item) {
                        case "+":

                            System.out.println("Ergebnis = " + (inputA + inputB));
                            break;
                        case "-":
                            System.out.println("Ergebnis = " + (inputA - inputB));
                            break;
                        case "*":
                            System.out.println("Ergebnis = " + (inputA * inputB));
                            break;
                        case "/":
                            System.out.println("Ergebnis = " + (inputA / inputB));
                            break;
                        case "%":
                            System.out.println("Ergebnis = " + countPercentage(inputA, inputB) + "%");

                            break;
                        default:
                            // es gibt diese zeichen nicht
                            System.out.print("Das ist kein Zeichen mit dam  man rechnen kann");
                            // geben Sie einen neuen Zeichen ein
                            System.out.println("Geben Sie einen Zeichen ein ");
                            item = keyboard.nextLine();
                            startagein2 = true;

                    }
                } while (startagein2); // do while    mindestes einmal wird es durchlaufen  aspon jednou musi probehnout

                if (!startagein) {
                    System.out.println("Moechtest du weiter machen falls ja druckt  J oder N  falls  Nein ");
                    final String odpoved = keyboard.nextLine();
                    if (odpoved.equals("J")) {
                        startagein = true;
                       
                    }
                }

            } catch (final ArithmeticException e) {
                System.out.println("Du solltest mit der Null nicht teilen");
                startagein = true;
            }




        }
        //scanner schliessen
        keyboard.close();
    }






}
