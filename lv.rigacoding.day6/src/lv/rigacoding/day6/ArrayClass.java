/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class ArrayClass {

    private static Scanner input = new Scanner(System.in);

    public void test() {
        int[] firstArray = new int[3];

        firstArray[0] = 1;
        firstArray[1] = 3;
        firstArray[2] = 5;

        //aizpilda ar ciklu:
        for (int i = 0; i < 3; i++) {
            firstArray[i] = 5;
        }

        int i = 0;
        while (true) {
            firstArray[i] = 5;
            i++;

            if (i >= 3) {
                break;
            }
        }

        int[] secondArray = new int[]{
            1, 3, 5
        };

        //izvada katru masīva elementu
        for (int element : firstArray) {
            System.out.print(element);
        }

        for (int j = 0; i < secondArray.length; i++) {
            int element2 = secondArray[i];
            System.out.print(element2);
        }

    }

    public void listTest() {
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<String> textList = new ArrayList<String>();
        textList.add("text1");
        textList.add("text2");

        textList.remove(1); //text2

        String element = textList.get(0); //text1

        ArrayList<String> textList2 = new ArrayList<String>() {
            {
                add("text1");
                add("text2");
                add("text2");
            }
        };
    }

    public static void findNumber() {
        int[] numbers = new int[]{
            0, 10, 20, 30, 40, 50
        };

        System.out.println("Ievadi skaitli: ");
        int n = input.nextInt();

        for (int element : numbers) {
            if (element == n) {
                System.out.println("Skaitlis atrodas masīvā");
                return;
            }

        }
        System.out.println("Neatrada skaitli");

    }

    public static void enterNumber() {
        System.out.print("Ievadi skaitļus");
        int n = input.nextInt();

        int[] userNumbers = new int[n];

        System.out.print("Ievadi " + n + " skaitļus");

        for (int i = 0; i < n; i++) {
            userNumbers[i] = input.nextInt();
        }

        int min = userNumbers[0];
        int max = userNumbers[0];
        for (int number : userNumbers) {
            if (max < number) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
