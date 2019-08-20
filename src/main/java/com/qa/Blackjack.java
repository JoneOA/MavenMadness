package com.qa;


public class Blackjack {

    public static int BLACKJACK = 21;// blackjack value

    public static void main(String[] args) {

        int dealerTotal = newCard() + newCard();
        if(dealerTotal <= 21) {
            System.out.println("Dealer starts with " + dealerTotal);
        }else{
            dealerTotal = 12;
            System.out.println("Dealer starts with " + dealerTotal);
        }
        int playerTotal = newCard() + newCard();

        if(playerTotal <= 21) {
            System.out.println("Player starts with " + playerTotal);
        }else{
            playerTotal = 12;
            System.out.println("Player starts with " + playerTotal);
        }

        while (dealerTotal <= 16) {
            dealerTotal += newCard();

            if (above21(dealerTotal) == true) {
                System.out.println("Dealer has bust! Total hit " + dealerTotal);
            } else {
                System.out.println("Dealers total is " + dealerTotal);
            }
        }

        while (playerTotal <= 16) {
            playerTotal += newCard();

            if (above21(playerTotal) == true) {
                System.out.println("Player has bust!");
            } else {
                System.out.println("Players total is " + playerTotal);
            }

        }
        System.out.println("Dealers final total is " + dealerTotal);
        System.out.println("Players final total is " + playerTotal);

        int closest_to_21 = compareValues(dealerTotal, playerTotal);

        System.out.println("------------------------> " + closest_to_21);

        if (playerTotal == closest_to_21) {
            System.out.println("Player wins");
        } else if (dealerTotal == closest_to_21) {
            System.out.println("Dealer wins");
        } else {
            System.out.println("Draw");
        }

    }

    public static int newCard() {
        return (int) (Math.random() * 11) + 1;
    }

    public static boolean above21(int input) {
        if (input > BLACKJACK) {
            return true;
        } else {
            return false;
        }

    }

    public static int compareValues(int dealer, int player) {

        // Dealer hits blackjack
        if (dealer == BLACKJACK && player != BLACKJACK) {
            return dealer;
        }
        // Player hits blackjack
        else if (player == BLACKJACK && dealer != BLACKJACK) {
            return player;
        }
        // Dealer wins
        else if (dealer < player && player > 21) {
            return dealer;
        }
        else if (dealer > player && dealer < 21) {
            return dealer;
        }

        // Player wins
        else if (dealer < player && player < 21) {
            return player;
        }
         else if (dealer > player && dealer > 21) {
            return player;
        } else {
            return 0;
        }
    }
}

