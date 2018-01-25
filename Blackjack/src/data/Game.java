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

    public Dealer dealer;
    public Player player;
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

    public void startNewGameUI() {
        deck = new Deck();
        deck.shuffle();

        player.removeCards();
        dealer.removeCards();

        giveCard(player, false);
        giveCard(player, false);
        giveCard(dealer, true);
        giveCard(dealer, false);

    }

    public void giveCard(Player player, boolean isBlind) {
        Card card = deck.takeCard();
        card.isBlind = isBlind;

        player.giveCard(card);
    }

    public boolean startNewGame() {

        boolean startNew = getAnswer("Vai uzsākt jaunu spēli (y/n)? ");

        if (startNew) {
            deck = new Deck();
            deck.shuffle();

            player.removeCards();
            dealer.removeCards();

            //player.giveCard(deck.takeCard());
            //player.giveCard(deck.takeCard());
            giveCard(player, false);
            giveCard(player, false);

            //dealer.giveCard(deck.takeCard());
            //dealer.giveCard(deck.takeCard());
            giveCard(dealer, true);
            giveCard(dealer, false);

            while (player.isInGame()) {
                player.giveCard(deck.takeCard());
            }

            dealerTurn();

            getResult();

        }

        return startNew;
    }

    public void dealerTurn() {
        while (dealer.isInGame()) {
            dealer.giveCard(deck.takeCard());
        }
    }

    private void getResult() {
        System.out.println(getResultText());

    }

    public String getResultText() {
        int playerPoints = player.getTotalPoints();
        int dealerPoints = dealer.getTotalPoints();

        System.out.println("Spēlētāja punkti: " + playerPoints);
        System.out.println("Dīlera punkti: " + dealerPoints);

        if (playerPoints > 21 && dealerPoints > 21) {
            return "Nav uzvarētāja.";
        } else if (playerPoints > 21) {
            return "Dīleris uzvarēja";
        } else if (dealerPoints > 21) {
            return "Spēlētājs uzvarēja.";         
        } else if (playerPoints == dealerPoints) {
            return "Nav uzvarētāja.";
        } else if (playerPoints > dealerPoints) {
            return "Spēlētājs uzvarēja.";
        } else {
            return "Dīleris uzvarēja.";
        }

    }
}
