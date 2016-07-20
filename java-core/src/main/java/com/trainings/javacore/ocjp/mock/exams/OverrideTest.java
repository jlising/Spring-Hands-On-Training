package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */

class Base {
    public static void foo(Base bObj) {
        System.out.println("In Base.foo()");
        bObj.bar();
    }
    public void bar() {
        System.out.println("In Base.bar()");
    }
}

class Derived extends Base {
    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }
    public void bar() {
        System.out.println("In Derived.bar()");
    }
}

public class OverrideTest {
    public static void main(String []args) {
        Base bObj = new Derived();
        bObj.foo(bObj); //foo() is a static method in Base so it is attached in a class not in instance. Base.foo() is the same with bObj.foo()
    }
}
