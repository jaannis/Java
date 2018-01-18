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
        
        System.out.print("F, C vai K: ");
        char mervieniba = input.next().charAt(0);
        
        //parametru pārvērš uz mazajiem burtiem
        mervieniba = Character.toLowerCase(mervieniba);
        
        if (mervieniba  == 'c'){
            toFahrenheit(siltums);
        }
        
        else if (mervieniba == 'f'){
            toCelsius(siltums);
        }
        
        else if (mervieniba == 'k'){
            toKelvim(siltums);
        }
        
        else {
            System.out.println("nemāki ievadīt skaitli");             
        }
        
        
    }
    
    private void toFahrenheit(int siltums){
       double fahrenheit = Math.round(siltums * 9/5 + 32);
       double kelvin = Math.round(siltums + 273.15);
        System.out.println(siltums + " C ir " + fahrenheit + " F vai "
        + kelvin + " K.");
    }
        
    private void toCelsius(int siltums){
        double celsius = Math.round((siltums - 32) * 5/9);
        double kelvin = Math.round((siltums + 459.67) * 5/9);
          System.out.println(siltums + " F ir " + celsius + " C vai "
          + kelvin + " K." );
    }
    
     private void toKelvim(int siltums){
       double fahrenheit = Math.round(siltums * 9/5 - 459.67);
       double celsius = Math.round(siltums - 273.15);
        System.out.println(siltums + " K ir " + fahrenheit + " F vai "
        + celsius + " C.");
    }
    
}
