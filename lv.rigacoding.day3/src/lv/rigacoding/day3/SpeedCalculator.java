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
public class SpeedCalculator {
    public SpeedCalculator(){
        Scanner input = new Scanner (System.in);
           
        System.out.print("Ievadi attālumu: ");
        int distance = input.nextInt();
        
        System.out.print("Ievadi laiku: ");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();

        int total  = getTotalTime(hours, minutes, seconds);
        getSpeed(distance, total);
        
               
    }

        
    public int getTotalTime (int hours, int minutes, int seconds){

        int total = seconds
                +minutes*60
                +hours*60*60;
        
        System.out.println("Kopējais laiks = "
        +total
        + " sekundes");
        
        return total;
    }
    public void getSpeed(int distance, int total){
        
       double speedMetrs = Math.round((double) distance/ (double) total);
       
       System.out.println("ātrums metros " + speedMetrs +" m/s");
       
       double kilometri = distance/1000;       
      
       double kmh = Math.round(((double) distance/1000) / ((double) total/3600));
       
       double mp = Math.round(distance/1000*0.621371);
       


       System.out.println("Kilometri stundā " + kmh + " kmh");
       System.out.println("Attālums kilometros " + kilometri + " km");       
       System.out.println("Attālums jūdzēs " + mp + " miles");



    }

}
