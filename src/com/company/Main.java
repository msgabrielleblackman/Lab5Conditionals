package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random randie = new Random();

        // Initialize Variables

        Scanner userDecision = new Scanner(System.in);
        System.out.println(" Welcome to the Grand Circus Casino! ");
        {

            System.out.println(" How many sides should each die have? ");
            String answer = "yes or no";

            System.out.println("Roll 1: ");

            int dice = userDecision.nextInt();

            System.out.println(randie.nextInt(dice) + (1));
            System.out.println(randie.nextInt(dice) + (1));
            System.out.println(randie.nextInt(dice) + (1));
            System.out.println(randie.nextInt(dice) + (1));

            System.out.println("Roll again? ");

            answer = userDecision.nextLine();
            do {
                System.out.println("Please Enter YES or NO ");
                answer = userDecision.nextLine();

            } while (answer.equals("yes"));
            {
                return;



            }
        }
        }
}