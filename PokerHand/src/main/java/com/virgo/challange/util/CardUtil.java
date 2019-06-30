package com.virgo.challange.util;

import com.virgo.challange.constant.SpecialRank;

public class CardUtil {
    public static String rankToString(int rank) {
        switch (rank) {
            case 1:
                return SpecialRank.ACE.getValue();
            case 11:
                return SpecialRank.JACK.getValue();
            case 12:
                return SpecialRank.QUEEN.getValue();
            case 13:
                return SpecialRank.KING.getValue();
            default:
                return String.valueOf(rank);
        }
    }
}
