/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day4;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class Loops {

//N skaitļu summa
    public static void countN() {

        Scanner input = new Scanner(System.in);
        System.out.println("Cik skaitļus N gribi ievadīt: ");

        int n = input.nextInt();
        int total = 0;
        int videjais = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ievadi " + i + " skaitlis.");
            int skaitlis = input.nextInt();
            total = total + skaitlis;
            //vai
            //sum+=input.nextInt();

            
        }
        videjais = (total / n);
        System.out.println("Vidējais ir " + videjais + ". Kopējais ir "
                + total);

    }

//Skaitļu summa līdz n
    public static void countToN() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi skaitli N: ");

        int n = input.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            total = total + i;
            //total += i;
            //tas pats 
        }

        System.out.println("Skaitļu summa = " + total);
    }
}
