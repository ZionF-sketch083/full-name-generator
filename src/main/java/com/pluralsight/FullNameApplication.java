package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.print("First name: ");
        String firstName = myScanner.nextLine();

        System.out.print("Middle Initial: ");
        String midInitial = myScanner.nextLine();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();

        System.out.println("Full name: "+ firstName +" "+ midInitial +" "+ lastName +", "+ suffix);

        myScanner.close();
    }
}
