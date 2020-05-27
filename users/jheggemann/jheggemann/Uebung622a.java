package jheggemann;

import java.util.Arrays;

public class Uebung622a {
    
    private static int[] arr;
    private static int max, min, sum = 0;
    private static double avr;
    private static int count;
    
    private static void getCount() {
        count = arr.length;
    }
    private static void getAvr() {
        avr = Arrays.stream(arr).average().getAsDouble();
    }
    private static void getSum() {
        sum = Arrays.stream(arr).sum();
    }
    public static void getMin() {
        min = Arrays.stream(arr).min().getAsInt();
    }
    public static void getMax(){
        max = Arrays.stream(arr).max().getAsInt();
    }
    public static void fillArray() {
        //Zufällige anzahl an Arrayelementen
        double rand1 = Math.random() * 100;
        int rand = (int) rand1;
        //Array initialisieren
        arr = new int[rand];
        //Array füllen
        for (int i = 0; i <= rand - 1; i++) {
            double wert = Math.random() * 100;
            arr[i] = (int) wert;
        }
    }
    public static void main(String args[]){
        //Arry mit Werten füllen
        fillArray();
        //Anzahl der Elemente im Array ermitteln
        getCount();
        //Maximalwert ermitteln
        getMax();
        //Minimalwert ermitteln
        getMin();
        //Array aufsummieren
        getSum();
        //Arraydurchschnitt ermitteln
        getAvr();
        System.out.println(String.format("Anzahl: %d", count));
        System.out.println(String.format("Average: %.1f", avr));
        System.out.println(String.format("Maximum: %d", max));
        System.out.println(String.format("Minimum: %d", min));
        System.out.println(String.format("Summe: %d", sum));
    }
}