/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Janis
 */
public class Card {

    //2..3..4..J..Q..K..A
    private String value;

    //H, S, D, C
    private char suit;
    
    public boolean isBlind;

    public Card(String value, char suit) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        switch (value) {

            case "A":
                return 11;

            case "K":
            case "Q":
            case "J":
                return 10;

            default:
                return Integer.valueOf(value);
        }
    }

    public String getFullName() {
        //piemēram, H10
        return suit + value; 

    }
    
    public String getValueString(){
        return value;
    }
}
