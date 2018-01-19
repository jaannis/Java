/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.majasdarbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class karatavas {

    private static Scanner input = new Scanner(System.in);

    public static String words() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Joks");
        words.add("Lokomative");
        words.add("Skola");
        words.add("Salmi");
        words.add("Upe");

        Collections.shuffle(words);

        String firstWord = words.get(0);
        return firstWord;
    }

    public static void kautkas() {
        String n = karatavas.words();

        for (int i=0; i < n.length(); i++){
            System.out.print(" _ ");

        }

    }

}
