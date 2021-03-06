package edu.ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1b_Three_Dimensions_Array {

    private final int column = 6, group = 3, element = 4;
    private final int[][][] randomNumbers = new int[column][group][element];
    Random random = new Random();
    private int minValue;

    public static void main(String[] args) {
        Aufgabe_1b_Three_Dimensions_Array test = new Aufgabe_1b_Three_Dimensions_Array();
        test.generateRandomNumbers();
        test.minimumOfNumbers();
        test.whereIsMinimum();
    }

    /**
     * fills the Array with random generating numbers
     */
    public void generateRandomNumbers() {
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    randomNumbers[col][grp][elm] = random.nextInt(11) + 20;
                }
            }
        }
        System.out.println(Arrays.deepToString(randomNumbers)
                .replace("[[[", " ( ").replace("]]]", " )")
                .replace("]],", " )\n").replace("[[", "( ")
                .replace("[", "( ").replace("]", " )")
                .replace(',', ' '));
    }

    /**
     * search the Array for the min Value
     */
    public void minimumOfNumbers() {
        minValue = randomNumbers[0][0][0];
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    if (minValue > randomNumbers[col][grp][elm]) {
                        minValue = randomNumbers[col][grp][elm];
                    }
                }
            }
        }
        System.out.println("Minimum of the numbers is: " + minValue + " on Position:");
    }

    /**
     * Find all the Positions of the minValue and print it
     */
    public void whereIsMinimum() {
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    if (randomNumbers[col][grp][elm] == minValue) {
                        System.out.println("Column: " + col + " Group: " + grp + " Element " + elm);
                    }
                }
            }
        }
    }
}
