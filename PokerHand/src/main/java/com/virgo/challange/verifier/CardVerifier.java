package com.virgo.challange.verifier;

import com.virgo.challange.dto.Card;

import java.util.List;

public class CardVerifier {
    public static void verifyDeck(List<Card> deck) {
        for (Card card : deck) {
            if (!verifyCard(card)) {
                throw new RuntimeException("A kovetkezo kartya ervenytelen a paklibol: " + card.toString());
            }
        }
    }

    public static void verifyHand(List<Card> hand) {
        if (hand.size() != 5) {
            throw new RuntimeException("A leosztott kartyak mennyisege 5 helyett: " + hand.size() + "!");
        }
    }

    private static boolean verifyCard(Card card) {
        return card.getColor() != null && card.getRank() >= 1 && card.getRank() <= 13;
    }
}
