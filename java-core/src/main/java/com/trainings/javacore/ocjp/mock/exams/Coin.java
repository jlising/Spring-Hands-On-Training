package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
interface Side { String getSide(); }

class Head implements Side {
    public String getSide() { return "Head "; }
}

class Tail implements Side {
    public String getSide() { return "Tail "; }
}

public class Coin {
    public static void overload(Head side) { System.out.print(side.getSide()); }
    public static void overload(Tail side) { System.out.print(side.getSide()); }
    public static void overload(Side side) { System.out.print("Side "); }
    public static void overload(Object side) { System.out.print("Object "); }

    public static void main(String []args) {
        Side firstAttempt = new Head();
        Tail secondAttempt = new Tail();
        overload(firstAttempt);//Side
        overload((Object)firstAttempt);//Object
        overload(secondAttempt);//Tail
        overload((Side)secondAttempt);//Side
    }
}