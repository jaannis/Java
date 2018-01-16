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
public class dilstosaVirkne {

    private static Scanner input = new Scanner(System.in);

    public static void dilst() {
        System.out.print("Dilstošs N: ");
        int n = input.nextInt();
        
        if (n < 0) {
                System.out.println("Ievadīta neatļauta vērtība");
            }
        else{
            for (int i = n; i >= 1; i--) {
            
            System.out.print(i);

        }
        }
        

    }
}
