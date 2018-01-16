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
public class numbers {

    private static Scanner input = new Scanner(System.in);

    public static void numbers() {
        System.out.print("Skaitli: ");
        int n = input.nextInt();
        

        for (int i = 1; i <= n; i++) {
            for (int u = 1; u <= i; u++) {
                System.out.print(u);
            }


        }
    }
}
