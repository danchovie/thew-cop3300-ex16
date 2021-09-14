/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int legal = 16;
	    Scanner newScanner = new Scanner(System.in);
        int user_age;
        String output;
        System.out.print("What is your age? ");
        user_age = newScanner.nextInt();
        output = (user_age>=legal)?"You are old enough to legally drive.":"You are not old enough to legally drive.";
        System.out.printf("%s", output);
    }
}
