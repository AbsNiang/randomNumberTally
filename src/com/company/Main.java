package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides has your dice got?");
        int sides = input.nextInt();
        System.out.println("How many times do you want to throw the dice?");
        int rounds = input.nextInt();
        HashMap<Integer, Integer> tally = new HashMap<>();
        for (int i = 1; i < sides + 1; i++) {
            tally.put(i, 0);
        }
        for (int i = 0; i < rounds; i++) {
            int rand = random.nextInt(sides) + 1;
            tally.put(rand, (tally.get(rand) + 1));
        }
        System.out.println(tally);
        for (int i = 1; i < sides + 1; i++) {
            double decPercentage = (double) tally.get(i) / rounds;
            double percentage = decPercentage * 100;
            System.out.println("The percentage it lands on side: " + i + " is " + percentage + "%");
        }
    }
}