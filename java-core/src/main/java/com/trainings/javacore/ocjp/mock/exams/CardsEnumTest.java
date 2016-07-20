package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */

enum Cards { CLUB, SPADE, DIAMOND, HEARTS };

public class CardsEnumTest {
    public static void main(String []args) {
        for(Cards card : Cards.values())
            System.out.print(card + " ");
    }
}

/**

 a) for(Cards card : Cards.values())
 System.out.print(card + " ");
 b) for(Cards card : Cards.iterator())
 System.out.print(card + " ");
 c) for(Cards card : Cards.enums())
 System.out.print(card + " ");
 d) for(Cards card : Cards.items())
 System.out.print(card + " ");

 **/