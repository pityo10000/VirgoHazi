package com.virgo.challange.dto;

import com.virgo.challange.constant.Color;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private int rank;
    private Color color;

    public Card() {
    }

    public Card(int rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    public int getRank() {
        return rank;
    }

    public Card setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Card setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                color == card.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, color);
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return this.getRank() - o.getRank();
    }
}
