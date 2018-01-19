/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class Game {

    private Dealer dealer;
    private Player player;
    private Deck deck;
    private static Scanner input = new Scanner(System.in);

    public Game() {
        dealer = new Dealer();
        player = new Player();
        deck = new Deck();
    }

    public static boolean getAnswer(String question) {
        System.out.print(question);
        char value = input.next().charAt(0);
        value = Character.toLowerCase(value);

        //return value == 'y';
        //tas pats kas:
        if (value == 'y') {
            return true;
        } else {
            return false;
        }
    }

    public boolean startNewGame() {

        boolean startNew = getAnswer("Vai uzsākt jaunu spēli (y/n)? ");

        if (startNew) {
            deck = new Deck();
            deck.shuffle();

            player.removeCards();
            dealer.removeCards();

            player.giveCard(deck.takeCard());
            player.giveCard(deck.takeCard());

            dealer.giveCard(deck.takeCard());
            dealer.giveCard(deck.takeCard());

            while (player.isInGame()) {
                player.giveCard(deck.takeCard());
            }

            while (dealer.isInGame()) {
                dealer.giveCard(deck.takeCard());
            }

            getResults();

        }

        return startNew;
    }

    private void getResults() {
        int playerPoints = player.getTotalPoints();
        int dealerPoints = dealer.getTotalPoints();

        System.out.println("Spēlētāja punkti: " + playerPoints);
        System.out.println("Dīlera punkti: " + dealerPoints);

        if (playerPoints > 21 && dealerPoints > 21) {
            System.out.println("Nav uzvarētāja.");
        } else if (playerPoints > 21) {
            System.out.println("Dīleris uzvarēja.");
        } else if (dealerPoints > 21) {
            System.out.println("Spēlētājs uzvarēja. ");
        } else if (playerPoints == dealerPoints) {
            System.out.println("Nav uzvarētāja. ");
        } else if (playerPoints > dealerPoints) {
            System.out.println("Spēlētājs uzvarēja. ");
        } else {
            System.out.println("Dīleris uzvarēja.");
        }

    }
}
