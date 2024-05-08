package com.cards.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private Suit suit;
    private Rank rank;

    public String toString() {
        if (suit != null) {
            return rank.getName() + " of " + suit.getName();
        } else {
            return rank.getName();
        }
    }
}
