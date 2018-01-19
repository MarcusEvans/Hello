package edu.xula.mevans7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name???\n");
        String name = sc.next();

        System.out.println("\nHello " + name.toUpperCase() +"\n");

    }
}
