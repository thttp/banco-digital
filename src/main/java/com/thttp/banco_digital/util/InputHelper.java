package com.thttp.banco_digital.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        int input = 0;
        boolean validInput = false;
        
        do {
            try {
                System.out.print(prompt + ": ");
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro válido.");
                scanner.nextLine();
            }
        } while (!validInput);
        
        return input;
    }

    public static double getDoubleInput(String prompt) {
        double input = 0.0;
        boolean validInput = false;
        
        do {
            try {
                System.out.print(prompt + ": ");
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Digite um número válido.");
                scanner.nextLine();
            }
        } while (!validInput);
        
        return input;
    }

    public static String getStringInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}
