package com.virgo.challange.generator;

import com.virgo.challange.constant.Color;
import com.virgo.challange.dto.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckGenerator {
    public static List<Card> generateDeck(int deckAmount) {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < deckAmount; i++) {
            for (Color color : Color.values()) {
                deck.addAll(generateStraight(color));
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    private static List<Card> generateStraight(Color color) {
        List<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, color));
        }
        return deck;
    }
}
