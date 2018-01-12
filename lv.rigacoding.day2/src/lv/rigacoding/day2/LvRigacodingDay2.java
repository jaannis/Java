/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day2;

/**
 *
 * @author Janis
 */
public class LvRigacodingDay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.variants
        Automasina auto1 = new Automasina();
        //2.variants
        Transportlidzeklis auto2 = new Automasina();
        
        Transportlidzeklis lidmasina = new Lidmasina();
        
        Transportlidzeklis vilciens = new Vilciens();
        
        auto1.Parvietoties();
        lidmasina.Parvietoties();
        vilciens.Parvietoties();
        
    }
    
    
