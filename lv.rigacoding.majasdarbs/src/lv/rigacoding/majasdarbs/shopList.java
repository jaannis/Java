/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.majasdarbs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class shopList {

    private ArrayList<shopItem> items;

    public shopList() {
        items = new ArrayList();
        items.add(new shopItem("Dators", 900));
        items.add(new shopItem("Bikses", 50));
        items.add(new shopItem("Auto", 1000));
        items.add(new shopItem("Mobilais", 200));
        items.add(new shopItem("TV", 550));
        items.add(new shopItem("Koferis", 100));
        items.add(new shopItem("Cimdi", 20));
        items.add(new shopItem("Cepure", 10));

        System.out.println("Pieejamās preces: ");

        for (shopItem item : items) {
            System.out.println(item.getName()
                    + " = "
                    + item.getPrice()
                    + "$");
        }

        Scanner input = new Scanner(System.in);
        int sum = 0;
        String text = "";

        do {
            System.out.print("Ievadi preces nosaukumu: ");
            text = input.next();

            for (shopItem item : items) {
                if (item.getName().equalsIgnoreCase(text)) {
                    sum += item.getPrice();
                    break;
                }
                
            }

        } while (!text.equals("0"));
        
        System.out.println("Kopsuma = " + sum + " $");

    }

}
