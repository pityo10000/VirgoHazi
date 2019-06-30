package com.virgo.challange.constant;

public enum Color {
    CLUBS("treff"),
    DIAMONDS("karo"),
    HEART("kor"),
    SPADES("pikk");

    Color(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
