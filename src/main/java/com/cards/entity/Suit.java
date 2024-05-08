package com.cards.entity;

public enum Suit {
    HEARTS("HEARTS"),
    DIAMONDS("DIAMONDS"),
    CLUBS("CLUBS"),
    SPADES("SPADES");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}