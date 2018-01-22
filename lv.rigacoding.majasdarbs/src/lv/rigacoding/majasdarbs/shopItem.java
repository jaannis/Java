/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.majasdarbs;

/**
 *
 * @author Janis
 */
public class shopItem {
    private double price;
    private String name;
    
    public shopItem (String name, double price){
        this.price = price;
        this.name = name;
            }
    
    public double getPrice(){
        return this.price;        
         }
    
    public String getName(){
        return this.name;
    }
}
