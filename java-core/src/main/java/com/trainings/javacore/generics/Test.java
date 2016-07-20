package com.trainings.javacore.generics;

/**
 * Created by jlising on 2/19/16.
 */
public class Test{

    static public void main(String[] args){
        MyExtendingClass myExtendingClass = new MyExtendingClass();

        System.out.println("The T class object : " + myExtendingClass.getT());
        System.out.println("The E class object : " + myExtendingClass.getE());

        System.out.println("The T class name : " + myExtendingClass.getTName());
        System.out.println("The E class name : " + myExtendingClass.getEName());

        System.out.println("\n");

        // See Generic restrictions
        // https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#instantiate
        MyGenericClass<TheTClass, TheEClass> myGenericClass = new MyGenericClass<>(TheTClass.class, TheEClass.class);

        System.out.println("The T class object : " + myGenericClass.getT());
        System.out.println("The E class object : " + myGenericClass.getE());

        System.out.println("The T class name : " + myGenericClass.getTName());
        System.out.println("The E class name : " + myGenericClass.getEName());
    }
}
