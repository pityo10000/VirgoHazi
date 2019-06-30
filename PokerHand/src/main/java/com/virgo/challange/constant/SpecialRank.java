package com.virgo.challange.constant;

public enum SpecialRank {
    ACE("asz"),
    JACK("bubi"),
    QUEEN("dama"),
    KING("kiraly");

    SpecialRank(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
