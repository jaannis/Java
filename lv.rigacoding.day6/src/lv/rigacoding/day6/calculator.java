/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day6;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class calculator {

    private static Scanner input = new Scanner(System.in);

    public static void calculatorLoop() {
        while (true) {
            calc();
            System.out.println("Vai turpināt (y/n)");

            if (Character.toLowerCase(input.next().charAt(0)) == 'n') {
                break;
            }
        }
    }

    public static void calc() {
        System.out.print("Ievadi skaitli 1");
        int skaitlis1 = input.nextInt();

        System.out.print("Ievadi darbību +, -, *, /");
        char darbiba = input.next().charAt(0);

        System.out.print("Ievadi skaitli 2");
        int skaitlis2 = input.nextInt();

        double result = 0;
        boolean isOk = true;

        switch (darbiba) {
            case '+':
                result = skaitlis1 + skaitlis2;
                break;

            case '-':
                result = skaitlis1 - skaitlis2;
                break;

            case '*':
                result = skaitlis1 * skaitlis2;
                break;

            case '/':
                result = skaitlis1 / (double) skaitlis2;
                break;

            default:
                isOk = false;
                break;

        }
        if (isOk) {
            System.out.println("Rezultāts = "
                    + String.format("%.2f", result));
        } else {
            System.out.println("Neatļauta darbība");

        }

    }

}
