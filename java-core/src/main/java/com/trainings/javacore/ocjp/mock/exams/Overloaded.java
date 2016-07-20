package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
class Overloaded {
    public static void foo(Integer i) { System.out.println("foo(Integer)"); }
    public static void foo(short i) { System.out.println("foo(short)"); }
    public static void foo(long i) { System.out.println("foo(long)"); }
    public static void foo(int ... i) { System.out.println("foo(int ...)"); }


    public static void main(String []args) {
        foo(10);//foo(long)
        foo((int) 10, (int) 11);//foo(int...)
        foo((short) 10); //foo(short)
    }
}