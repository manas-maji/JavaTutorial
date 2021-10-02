package com.manas.maji;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int n = s.nextInt();

        if (n >= 0) {
            int factorial = 1;
            for (int i = 2; i <= n ; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + n + " = " + factorial);
        } else {
            System.out.println("Factorial of " + n + " does not exit");
        }

    }
}
