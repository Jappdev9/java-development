package com.pluralsight;

import java.util.Random;

public class RollTheDice {
    public static void main(String[] args) throws InterruptedException {
        Dice dice = new Dice();
        int roll1, roll2, twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i < 20; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);
            int sum = roll1 + roll2;
            System.out.println("Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }

            Thread.sleep(1000);
        }

        System.out.println("Number of times 2 is rolled: " + twoCounter);
        System.out.println("Number of times 4 is rolled: " + fourCounter);
        System.out.println("Number of times 6 is rolled: " + sixCounter);
        System.out.println("Number of times 7 is rolled: " + sevenCounter);
    }
}

class Dice {
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}




