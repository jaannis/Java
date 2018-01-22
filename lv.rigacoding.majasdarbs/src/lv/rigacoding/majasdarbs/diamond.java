/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.majasdarbs;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class diamond {

    private static Scanner input = new Scanner(System.in);

    public static void tristuris() {
        System.out.print("Cik lielu trīstūri N: ");
        int n = input.nextInt();

        for (int rinda = 1; rinda <= n; rinda++) {
            //atstarpes
            for (int spaces = 1; spaces <= n - rinda; spaces++) {
                System.out.print(" ");
            }
            //zvaigznītes
            for (int zvaigzne = 1; zvaigzne <= 2*rinda - 1; zvaigzne++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rinda = n - 1; rinda >= 1; rinda--) {
            //atstarpes
            for (int spaces = 1; spaces <= n - rinda; spaces++) {
                System.out.print(" ");
            }
            //zvaigznītes
            for (int zvaigzne = 1; zvaigzne <= 2*rinda - 1; zvaigzne++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    

}
