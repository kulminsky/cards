package com.cards.service;

import com.cards.entity.Card;

import java.util.List;

public interface DeckService {
    void shuffle();
    List<Card> dealCards(int numberOfCards);
    void fold();
    List<Card> getCards();
}
