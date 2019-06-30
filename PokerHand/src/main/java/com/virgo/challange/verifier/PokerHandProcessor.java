package com.virgo.challange.verifier;

import com.virgo.challange.constant.PokerHand;
import com.virgo.challange.dto.Card;

import java.util.List;

public class PokerHandProcessor {
    public static PokerHand getPokerHand(List<Card> hand) {
        CardVerifier.verifyHand(hand);
        boolean sameColor = PokerHandChecker.checkSameColor(hand);
        boolean straight = PokerHandChecker.checkStraight(hand) || PokerHandChecker.checkAceHighStraight(hand);

        if (sameColor && PokerHandChecker.checkAceHighStraight(hand)) {
            return PokerHand.ROYAL_FLUSH;
        } else if (sameColor && straight) {
            return PokerHand.STRAIGHT_FLUSH;
        } else if (PokerHandChecker.checkFourOfKind(hand)) {
            return PokerHand.FOUR_OF_A_KIND;
        } else if (PokerHandChecker.checkFullHouse(hand)) {
            return PokerHand.FULL_HOUSE;
        } else if (sameColor) {
            return PokerHand.FLUSH;
        } else if (straight) {
            return PokerHand.STRAIGHT;
        } else if (PokerHandChecker.checkThreeOfKind(hand)) {
            return PokerHand.THREE_OF_A_KIND;
        } else if (PokerHandChecker.checkTwoPair(hand)) {
            return PokerHand.TWO_PAIR;
        } else if (PokerHandChecker.checkPair(hand)) {
            return PokerHand.PAIR;
        } else {
            return PokerHand.HIGH_CARD;
        }
    }
}
