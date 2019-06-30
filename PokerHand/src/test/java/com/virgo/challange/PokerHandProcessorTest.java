package com.virgo.challange;

import com.virgo.challange.constant.Color;
import com.virgo.challange.constant.PokerHand;
import com.virgo.challange.dto.Card;
import com.virgo.challange.verifier.PokerHandProcessor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PokerHandProcessorTest {
    @Test
    public void royalFlushTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(10, Color.CLUBS));
        hand.add(new Card(11, Color.CLUBS));
        hand.add(new Card(12, Color.CLUBS));
        hand.add(new Card(13, Color.CLUBS));
        hand.add(new Card(1, Color.CLUBS));
        Assert.assertEquals(PokerHand.ROYAL_FLUSH, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void straightFlushTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(2, Color.CLUBS));
        hand.add(new Card(3, Color.CLUBS));
        hand.add(new Card(4, Color.CLUBS));
        hand.add(new Card(5, Color.CLUBS));
        hand.add(new Card(6, Color.CLUBS));
        Assert.assertEquals(PokerHand.STRAIGHT_FLUSH, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void fourOfAKindTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(2, Color.CLUBS));
        hand.add(new Card(2, Color.HEART));
        hand.add(new Card(3, Color.DIAMONDS));
        hand.add(new Card(2, Color.DIAMONDS));
        hand.add(new Card(2, Color.SPADES));
        Assert.assertEquals(PokerHand.FOUR_OF_A_KIND, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void fullHouseTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(2, Color.CLUBS));
        hand.add(new Card(2, Color.HEART));
        hand.add(new Card(1, Color.DIAMONDS));
        hand.add(new Card(1, Color.DIAMONDS));
        hand.add(new Card(1, Color.SPADES));
        Assert.assertEquals(PokerHand.FULL_HOUSE, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void flushTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(2, Color.DIAMONDS));
        hand.add(new Card(2, Color.DIAMONDS));
        hand.add(new Card(4, Color.DIAMONDS));
        hand.add(new Card(7, Color.DIAMONDS));
        hand.add(new Card(6, Color.DIAMONDS));
        Assert.assertEquals(PokerHand.FLUSH, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void straightTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(10, Color.CLUBS));
        hand.add(new Card(11, Color.HEART));
        hand.add(new Card(12, Color.DIAMONDS));
        hand.add(new Card(9, Color.DIAMONDS));
        hand.add(new Card(8, Color.SPADES));
        Assert.assertEquals(PokerHand.STRAIGHT, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void threeOfAKindTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(12, Color.CLUBS));
        hand.add(new Card(11, Color.HEART));
        hand.add(new Card(12, Color.DIAMONDS));
        hand.add(new Card(12, Color.DIAMONDS));
        hand.add(new Card(8, Color.SPADES));
        Assert.assertEquals(PokerHand.THREE_OF_A_KIND, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void twoPairTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(10, Color.CLUBS));
        hand.add(new Card(10, Color.HEART));
        hand.add(new Card(12, Color.DIAMONDS));
        hand.add(new Card(9, Color.DIAMONDS));
        hand.add(new Card(9, Color.SPADES));
        Assert.assertEquals(PokerHand.TWO_PAIR, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void pairTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(10, Color.CLUBS));
        hand.add(new Card(10, Color.HEART));
        hand.add(new Card(12, Color.DIAMONDS));
        hand.add(new Card(9, Color.DIAMONDS));
        hand.add(new Card(6, Color.SPADES));
        Assert.assertEquals(PokerHand.PAIR, PokerHandProcessor.getPokerHand(hand));
    }

    @Test
    public void highCardTest() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(1, Color.CLUBS));
        hand.add(new Card(3, Color.HEART));
        hand.add(new Card(4, Color.DIAMONDS));
        hand.add(new Card(6, Color.DIAMONDS));
        hand.add(new Card(9, Color.SPADES));
        Assert.assertEquals(PokerHand.HIGH_CARD, PokerHandProcessor.getPokerHand(hand));
    }
}
