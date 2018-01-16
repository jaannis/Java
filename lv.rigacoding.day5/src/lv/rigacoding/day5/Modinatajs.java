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
public class Modinatajs {

    private static Scanner input = new Scanner(System.in);

    public static void modina() {
        System.out.print("Nedēļas diena:P, O, T, C, Pk, S, Sv ");
        String diena = input.next();

        System.out.print("Ir vai Nav atvaļinājums");
        String atvalinajums = input.next();

        if (atvalinajums.equals("Ir")) {
            if (diena.equals("P") || diena.equals("O") || diena.equals("T")
                    || diena.equals("C") || diena.equals("Pk")) {

                System.out.println("10:00");
            } else {
                System.out.println("Off");

            }

        } else if (atvalinajums.equals("Nav")) {
            if (diena.equals("P") || diena.equals("O") || diena.equals("T")
                    || diena.equals("C") || diena.equals("Pk")) {
                System.out.println("7:00");

            } else {
                System.out.println("10:00");

            }

        } else {
            System.out.println("Nepareizi kaut ko savadīji");
        }

    }

}
