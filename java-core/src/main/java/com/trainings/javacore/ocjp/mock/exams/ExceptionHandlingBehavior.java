package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
class ExceptionHandlingBehavior {
    public static void main(String []args) {
        try {
            int i = 10/0; // LINE A
            System.out.print("after throw -> ");
        } catch(ArithmeticException ae) {
            System.out.print("in catch -> ");
            return;
        } finally {
            System.out.print("in finally -> ");
        }

        //This will not be executed due to return satement
        System.out.print("after everything");
    }
}
