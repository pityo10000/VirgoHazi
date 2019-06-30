package com.virgo.challange.constant;

public enum PokerHand {
    ROYAL_FLUSH("rojalflos"),
    STRAIGHT_FLUSH("szinsor"),
    FOUR_OF_A_KIND("poker"),
    FULL_HOUSE("full"),
    FLUSH("flos"),
    STRAIGHT("sor"),
    THREE_OF_A_KIND("drill"),
    TWO_PAIR("ket par"),
    PAIR("egy par"),
    HIGH_CARD("magas lap");

    PokerHand(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
