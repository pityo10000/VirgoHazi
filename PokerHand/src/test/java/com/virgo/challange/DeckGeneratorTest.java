package com.virgo.challange;

import com.virgo.challange.dto.Card;
import com.virgo.challange.generator.DeckGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeckGeneratorTest {
    @Test
    public void generateAndShuffleTest() {
        List<Card> deck = DeckGenerator.generateDeck(2);
        Assert.assertEquals(104, deck.size());

        List<Card> shuffledDeck = new ArrayList<>(deck);
        DeckGenerator.shuffleDeck(shuffledDeck);
        Assert.assertNotEquals(deck, shuffledDeck);
    }
}
