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

    private static Scanner input = new Scanner(System.in);

    public static void reverseNumber() {
        System.out.print("Skaitli N: ");
        int n = input.nextInt();

        int atlikums = n % 10;
        int veselaDala = n / 10;
        System.out.print(atlikums);

        while (0 < veselaDala) {
            atlikums = veselaDala % 10;
            System.out.print(atlikums);

            veselaDala = veselaDala / 10;
        }
    }

    public static void tristuris() {
        System.out.print("Cik lielu trīstūri N: ");
        int n = input.nextInt();

        for (int rinda = 0; rinda < n; rinda++) {
            for (int kolonna = 1; kolonna <= rinda + 1; kolonna++) {
                System.out.print(kolonna);

            }
            System.out.println();

        }

    }

    public static void rezgis() {

        System.out.println("Cik daudz režģu N: ");

        int n = input.nextInt();

        for (int rinda = 0; rinda < n; rinda++) {
            for (int kolonna = 0; kolonna < n; kolonna++) {

                System.out.print("#");

            }

            System.out.println();

        }
        //ar while
        int rinda = 0;
        while (rinda < n) {
            int kolona = 0;

            while (kolona < n) {
                System.out.print("#");
                kolona++;
            }
            System.out.println();
            rinda++;
        }

    }
    //N skaitļu summa

    public static void countN() {

        System.out.println("Cik skaitļus N gribi ievadīt: ");

        int n = input.nextInt();
        int total = 0;
        double videjais = 0;

        for (int i = ; i <= n; i++) {
            System.out.println("Ievadi " + i + " skaitlis.");
            int skaitlis = input.nextInt();
            total = total + skaitlis;
            //vai
            //sum+=input.nextInt();

        }
        videjais = (double) total / n;
        System.out.println("Kopējais ir " + total);
        System.out.println("Vidējais ir " + String.format("%.2f", videjais));

    }

//Skaitļu summa līdz n
    public static void countToN() {

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
