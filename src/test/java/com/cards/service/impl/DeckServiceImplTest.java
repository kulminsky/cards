package com.cards.service.impl;

import com.cards.entity.Card;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DeckServiceImplTest {

    @Test
    void testShuffle() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        List<Card> originalCards = List.copyOf(deckService.getCards());

        deckService.shuffle();

        assertNotEquals(originalCards, deckService.getCards());
    }

    @Test
    void testDealCards() {
        DeckServiceImpl deckService = new DeckServiceImpl();

        int numberOfCardsToDeal = 5;
        List<Card> dealtCards = deckService.dealCards(numberOfCardsToDeal);

        assertEquals(numberOfCardsToDeal, dealtCards.size());
        assertEquals(deckService.getCards().size(), 54 - numberOfCardsToDeal);
    }

    @Test
    void testFold() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        deckService.shuffle();

        deckService.fold();

        assertEquals(54, deckService.getCards().size());
    }
}