package com.trainings.javacore.generics;

import org.springframework.core.GenericTypeResolver;

/**
 * Created by jlising on 2/19/16.
 */
public class MyGenericClass<T, E> implements MyInteface<T, E>{
    private Class<T> theTClass;
    private Class<E> theEClass;

    public MyGenericClass(){
        Class<?>[] typeArguments = GenericTypeResolver.resolveTypeArguments(getClass(), MyGenericClass.class);

        this.theTClass = (Class<T>) typeArguments[0];
        this.theEClass = (Class<E>) typeArguments[1];
    }

    public MyGenericClass(Class<T> theTClass, Class<E> theEClass){
        Class<?>[] typeArguments = GenericTypeResolver.resolveTypeArguments(getClass(), MyGenericClass.class);

        this.theTClass = theTClass;
        this.theEClass = (Class<E>) theEClass;
    }

    @Override
    public Class<T> getT() {
        return theTClass;
    }

    @Override
    public Class<E> getE() {
        return theEClass;
    }

    @Override
    public String getTName() {
        return theTClass.getName();
    }

    @Override
    public String getEName() {
        return theEClass.getName();
    }
}
