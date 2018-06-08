package com.company;

import java.util.Random;

public class FizzBuzz {

    public static void main(String[] args) {
        // write your code her
        String fizzBuz[] = ranNum();
        for (int i = 0; i < fizzBuz.length; i++) {
            System.out.println(fizzBuz[i]);
        }
    }

    public static String[] getFizzBuzz() {
        String fishing[] = new String[100];


        for (int i = 1; i <= fishing.length; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 7
                fishing[i - 1] = ("Fizz Buzz");
            else if ((i % 3) == 0) // Is it a multiple of 3
                fishing[i - 1] = ("Fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5
                fishing[i - 1] = ("Buzz");
            else if ((i % 7) == 0) // Is it a multiple of 7
                fishing[i - 1] = String.valueOf(i) + (" - Multiple of Seven");
            else
                fishing[i - 1] = String.valueOf(i); // Not a multiple of 5 or 7
        }
        return fishing;


    }

    public static String[] ranNum() {
        Random ran = new Random();
        int start = 1 + ran.nextInt(100);
        int end = 1 + ran.nextInt(100);

        String[] value = getFizzBuzz();
        String content[] = new String[value.length];

        for (int i = 0; i < value.length; i++) {
            content[i] = value[i];
        }
        if (start == end) {
            content[0] = "Shazam";
            content[content.length - 1] = "Shazam";
        }
        return content;


    }
}
