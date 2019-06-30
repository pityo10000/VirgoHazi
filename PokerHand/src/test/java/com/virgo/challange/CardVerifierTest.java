package com.virgo.challange;

import com.virgo.challange.constant.Color;
import com.virgo.challange.dto.Card;
import com.virgo.challange.verifier.CardVerifier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CardVerifierTest {
    @Test
    public void verifyDeckSuccessTest() {
        List<Card> deck = new ArrayList<>();
        deck.add(new Card(12, Color.CLUBS));
        deck.add(new Card(2, Color.SPADES));
        CardVerifier.verifyDeck(deck);
    }

    @Test
    public void verifyDeckWrongRankTest() {
        List<Card> deck = new ArrayList<>();
        deck.add(new Card(12, Color.CLUBS));
        deck.add(new Card(0, Color.SPADES));
        try {
            CardVerifier.verifyDeck(deck);
            Assert.fail();
        } catch (RuntimeException ignored) {}
    }

    @Test
    public void verifyDeckMissingColorTest() {
        List<Card> deck = new ArrayList<>();
        deck.add(new Card(12, null));
        deck.add(new Card(2, Color.SPADES));
        try {
            CardVerifier.verifyDeck(deck);
            Assert.fail();
        } catch (RuntimeException ignored) {}
    }
}
