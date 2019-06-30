package com.virgo.challange.verifier;

import com.virgo.challange.dto.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerHandChecker {
    public static boolean checkSameColor(List<Card> cards) {
        Collections.sort(cards);
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getColor() != cards.get(i - 1).getColor()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkStraight(List<Card> cards) {
        Collections.sort(cards);
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getRank() - cards.get(i - 1).getRank() != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAceHighStraight(List<Card> cards) {
        Collections.sort(cards);
        return cards.get(0).getRank() == 1
                && cards.get(1).getRank() == 10
                && cards.get(2).getRank() == 11
                && cards.get(3).getRank() == 12
                && cards.get(4).getRank() == 13;
    }

    public static boolean checkPair(List<Card> cards) {
        Collections.sort(cards);
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getRank() == cards.get(i - 1).getRank()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkThreeOfKind(List<Card> cards) {
        Collections.sort(cards);
        for (int i = 2; i < cards.size(); i++) {
            if (cards.get(i).getRank() == cards.get(i - 1).getRank()
                    && cards.get(i).getRank() == cards.get(i - 2).getRank()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFourOfKind(List<Card> cards) {
        Collections.sort(cards);
        for (int i = 3; i < cards.size(); i++) {
            if (cards.get(i).getRank() == cards.get(i - 1).getRank()
                    && cards.get(i).getRank() == cards.get(i - 2).getRank()
                    && cards.get(i).getRank() == cards.get(i - 3).getRank()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFullHouse(List<Card> cards) {
        Collections.sort(cards);
        List<Card> cardsToCheck = new ArrayList<>(cards);
        for (int i = 2; i < cardsToCheck.size(); i++) {
            if (cardsToCheck.get(i).getRank() == cardsToCheck.get(i - 1).getRank()
                    && cardsToCheck.get(i).getRank() == cardsToCheck.get(i - 2).getRank()) {
                cardsToCheck.remove(i);
                cardsToCheck.remove(i - 1);
                cardsToCheck.remove(i - 2);
            }
        }
        return cardsToCheck.size() == 2 && cardsToCheck.get(0).getRank() == cardsToCheck.get(1).getRank();
    }

    public static boolean checkTwoPair(List<Card> cards) {
        Collections.sort(cards);
        List<Card> cardsToCheck = new ArrayList<>(cards);
        for (int i = 2; i < cardsToCheck.size(); i++) {
            if (cardsToCheck.get(i).getRank() == cardsToCheck.get(i - 1).getRank()) {
                cardsToCheck.remove(i);
                cardsToCheck.remove(i - 1);
            }
        }
        return cardsToCheck.size() == 3 && checkPair(cardsToCheck);
    }
}
