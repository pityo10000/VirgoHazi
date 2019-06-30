package com.virgo.challange;

import com.virgo.challange.constant.PokerHand;
import com.virgo.challange.dto.Card;
import com.virgo.challange.generator.DeckGenerator;
import com.virgo.challange.util.CardUtil;
import com.virgo.challange.verifier.CardVerifier;
import com.virgo.challange.verifier.PokerHandProcessor;

import java.util.List;

public class PokerHandApplication {

    public static void main(String[] args) {
        int deckAmount = processAmountParameter(args);

        //Generate and verify deck
        List<Card> deck = DeckGenerator.generateDeck(deckAmount);
        CardVerifier.verifyDeck(deck);
        DeckGenerator.shuffleDeck(deck);

        //Get hand with 5 card
        List<Card> hand = deck.subList(0, 5);
        System.out.println("A kiosztott lapok a kovetkezok: ");
        logHand(hand);

        //Get
        PokerHand result = PokerHandProcessor.getPokerHand(hand);
        System.out.println("A pokerkez a kovetkezo: " + result.getValue());
    }

    private static void logHand(List<Card> hand) {
        for (Card card : hand) {
            System.out.println(card.getColor().getValue() + "\t" + CardUtil.rankToString(card.getRank()));
        }
    }

    private static int processAmountParameter(String[] args) {
        int deckAmount = 1;

        if (args.length > 1) {
            throw new RuntimeException("Tul sok parametert adott meg! Maximum egy parametert lehet megadni.");
        } else if (args.length == 1) {
            try {
                deckAmount = Integer.valueOf(args[0]);
                if (deckAmount <= 0) {
                    throw new RuntimeException("A megadott mennyiseg hibas! Parameterkent egy darab pozitiv egesz szam adhato meg.");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException("A parameter formatuma hibas! Parameterkent egy darab pozitiv egesz szam adhato meg.", e);
            }
        }

        return deckAmount;
    }
}
