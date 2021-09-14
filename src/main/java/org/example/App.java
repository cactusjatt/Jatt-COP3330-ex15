/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        // Use scanner to get input from user
        Scanner in = new Scanner(System.in);

        System.out.print("What is the username? ");
        String user = in.nextLine();
        System.out.print("What is the password? ");
        String pass = in.nextLine();

        if(pass.equals("abc$123")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }

        in.close();
    }
}