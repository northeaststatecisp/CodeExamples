/**
 * -------------------------------------------------
 * File name: BasicLoop.java
 * Project name: CS1 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();

            if(numDice > 0){
                //the rest of the program
                System.out.print(" Enter num sides: ");

                numSides = scanner.nextInt();
            }
        }while(numDice > 0);
    }
}
