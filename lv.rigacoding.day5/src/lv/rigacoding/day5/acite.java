/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day5;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class acite {

    private static Scanner input = new Scanner(System.in);

    public static void speed() {
        System.out.print("Ievadi vienu skaitli ");
        int skaitlis1 = input.nextInt();

        System.out.print("Ievadi otru skaitli ");
        int skaitlis2 = input.nextInt();

        if (skaitlis1 <= 21 && skaitlis2 <= 21) {
            if (skaitlis1 > skaitlis2) {
                System.out.print(skaitlis1);

            } else if (skaitlis1 < skaitlis2) {
                System.out.print(skaitlis2);

            } else {
                System.out.print("Niča");
            }

        } else if (skaitlis1 > 21 && skaitlis2 < 22) {
            System.out.print(skaitlis2);

        } else if (skaitlis1 < 22 && skaitlis2 > 22) {
            System.out.print(skaitlis1);

        } else {
            System.out.print("Abi zaudējāt");

        }

    }
}
