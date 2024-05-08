package com.cards;

import com.cards.service.DeckService;
import com.cards.service.impl.DeckServiceImpl;

public class Main {

    public static void main(String[] args) {

        DeckService deckService = new DeckServiceImpl();
        System.out.println("Before shuffle:");
        System.out.println(deckService.getCards());

        deckService.shuffle();

        System.out.println("\nAfter shuffle:");
        System.out.println(deckService.getCards());

        System.out.println("\nDealing 2 cards:");
        System.out.println(deckService.dealCards(2));

        System.out.println("\nAfter dealing 2 cards:");
        System.out.println(deckService.getCards());

        deckService.fold();

        System.out.println("\nAfter folding:");
        System.out.println(deckService.getCards());
    }
}