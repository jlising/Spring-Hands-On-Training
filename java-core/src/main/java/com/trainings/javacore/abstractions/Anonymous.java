package com.trainings.javacore.abstractions;

/**
 * Created by jlising on 2/23/16.
 */
public class Anonymous {

    interface hello{}
    class myClass{}

    public void test(){
        class anotherClass extends myClass{

        }

        class yetAnotherClass extends myClass implements hello{

        }

    }
}
