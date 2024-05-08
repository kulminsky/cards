package com.cards.service.impl;

import com.cards.entity.Card;
import com.cards.entity.Rank;
import com.cards.entity.Suit;
import com.cards.service.DeckService;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class DeckServiceImpl implements DeckService {

    private List<Card> cards;

    public DeckServiceImpl() {
        initializeDeck();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public List<Card> dealCards(int numberOfCards) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            if (!cards.isEmpty()) {
                dealtCards.add(cards.remove(0));
            } else {
                break;
            }
        }
        return dealtCards;
    }

    @Override
    public void fold() {
        initializeDeck();
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    private void initializeDeck() {
        this.cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                if (rank != Rank.JOKER) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        cards.add(new Card(null, Rank.JOKER));
        cards.add(new Card(null, Rank.JOKER));
    }
}
