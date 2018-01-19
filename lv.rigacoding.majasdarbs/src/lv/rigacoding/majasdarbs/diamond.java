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

        for (int i = 1; i < n; i++) {
            for (int k = 0; k < (2*n - 2,i,j); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
