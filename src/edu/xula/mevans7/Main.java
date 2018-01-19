package edu.xula.mevans7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome\n");

        Scanner sc = new Scanner(System.in);
        //TODO Input User's Name
        System.out.println("What is your Name???\n");
        String name = sc.next();
        //TODO Output User's Name with Message
        System.out.println("\nHello " + name.toUpperCase() +"\n");
        //TODO Initialized Array List
        ArrayList<Integer> absences = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            Random rand = new Random();
            int number = rand.nextInt(10)+1;
            absences.add(number);
        }
        //TODO Output Array
        System.out.println(absences);


    }
}
