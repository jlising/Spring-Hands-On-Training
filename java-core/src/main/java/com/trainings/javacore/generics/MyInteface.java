package com.trainings.javacore.generics;

/**
 * Created by jlising on 2/19/16.
 */
public interface MyInteface<T, E> {
    Class<T> getT();
    Class<E> getE();

    String getTName();
    String getEName();
}
