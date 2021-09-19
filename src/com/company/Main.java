package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userEnd ="y";
        while (Objects.equals(userEnd, "y"))//code hints gave me this one
        {
            int total= 0;
            Scanner input = new Scanner(System.in);
            System.out.println("How many dice with sides do you want?(Please enter in XdY form");
            String userChoice = input.nextLine();
            String[] splitResult;
            splitResult = userChoice.split("d");
            int numDice = Integer.parseInt(splitResult[0]);//code hints gave me this one
            int numSides =Integer.parseInt(splitResult[1]);//code hints gave me this one
            int[] dice = new int[numDice];
            for (int i = 0; i < numDice; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
            }
            String msg = "";
            for (int die : dice) {
            msg += "You rolled " + die + " on a " + numSides+ " sided dice.\n";
                System.out.println(msg);
            total += die;
            }
            System.out.println("Your total is " + total + "\n");
            System.out.println("Would you like to roll again?\nPlease enter y for yes and n for no" );
            userEnd = input.nextLine();
        }

    }
}
