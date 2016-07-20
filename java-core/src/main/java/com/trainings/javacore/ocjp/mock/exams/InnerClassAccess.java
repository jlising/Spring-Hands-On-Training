package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */

class Outer {
    static class Inner {
        public final String text = "Inner";
    }
}

public class InnerClassAccess {
    public static void main(String []args) {
        System.out.println(new Outer.Inner().text);
    }
}

/**
 a) new Outer.Inner().text
 b) Outer.new Inner().text
 c) Outer.Inner.text
 d) new Outer().Inner.text
 */
