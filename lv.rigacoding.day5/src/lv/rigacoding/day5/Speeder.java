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
public class Speeder {

    private static Scanner input = new Scanner(System.in);

    public static void speed() {
        System.out.print("Ievadi savu ātrumu: ");
        int atrums = input.nextInt();

        System.out.print("Ir tev dzimene?: Y or N");
        char dzimene = input.next().charAt(0);

        if (dzimene == 'Y' || dzimene == 'y') {
            if (atrums > 85) {
                System.out.println("2");
            } else if (atrums > 65) {
                System.out.println("1");

            } else {
                System.out.println("0");

            }

        } else {
            if (atrums > 80) {
                System.out.println("2");
            } else if (atrums > 60) {
                System.out.println("1");

            } else {
                System.out.println("0");

            }

        }
    }

}
