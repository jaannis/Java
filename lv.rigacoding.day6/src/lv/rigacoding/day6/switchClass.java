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
public class switchClass {

    private static Scanner input = new Scanner(System.in);

    public static void country() {

        System.out.print("Ievadi valsti");
        String country = input.next().toLowerCase();
        
        switch (country) {

            case "latvija":
                System.out.println("Rīga");
                break;

            case "somija":
                System.out.println("Rīga");
                break;

            case "austrija":
                System.out.println("Vīne");
                break;

            case "lietuva":
                System.out.println("Viļņa");
                break;

            case "francija":
                System.out.println("Parīze");
                break;

            default:
                System.out.println("Nezināma galvaspilsēta");
                break;

        }
    }

}
