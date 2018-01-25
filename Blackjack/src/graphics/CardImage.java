/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import data.Card;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Janis
 */
public class CardImage extends JLabel {

    public CardImage(Card card) {
        
        String cardName = card.getFullName() + ".png";
        
        if(card.isBlind){
            cardName = "00.png";
        }else{
            cardName = card.getFullName() + ".png";
        }
        
        //tikai īsāk
        //String cardName = card.isBling ? "00.png" : cardGetFullName() + ".png";

        this.setIcon(new ImageIcon(getClass().getResource("/images/" + cardName)));

    }

}
