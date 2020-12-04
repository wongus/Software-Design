package com.hz;

import card.Card;
import card.GraduationCard;
import card.PostCard;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        PostCard postCard = new PostCard(printer);
        GraduationCard graduationCard = new GraduationCard(printer);

        graduationCard.print();
    }
}
