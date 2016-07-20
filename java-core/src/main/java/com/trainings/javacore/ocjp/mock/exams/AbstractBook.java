package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
abstract class AbstractBook {
    public String name;
}

interface Sleepy {
    public String name = "undefined";
}

class Book extends AbstractBook implements Sleepy {
    public Book(String name) {
        //this.name = name; // LINE A
    }
    public static void main(String []args) {
        AbstractBook philosophyBook = new Book("Principia Mathematica");
        System.out.println("The name of the book is " + philosophyBook.name); // LINE B
    }
}