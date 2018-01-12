/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day3;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class Converter {
    public Converter(){
        Scanner input = new Scanner (System.in);
        System.out.print("Ievadi grādus: ");
        int siltums = input.nextInt();
        
        System.out.print("F vai C: ");
        char mervieniba = input.next().charAt(0);
        
        if (mervieniba == 'F' || mervieniba  == 'f'){
            toFahrenheit(siltums);
        }
        
        else if (mervieniba == 'C' || mervieniba == 'c'){
            toCelsius(siltums);
        }
        
        else {
            System.out.println("nemāki ievadīt skaitli");             
        }
        
        
    }
    
    private void toFahrenheit(int siltums){
       double fagrenheits = siltums * 9/5 + 32;
        System.out.println(fagrenheits + " Farenheiti");
    }
        
    private void toCelsius(int siltums){
        double Celsius = (siltums - 32) * 5/9;
          System.out.println(Celsius + " Celsiji");
    }
    
}
