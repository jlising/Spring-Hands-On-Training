package com.trainings.javacore.generics2.bounded;

/**
 * @author jlising - 3/7/16.
 */
class TheBoundedGen<T extends AClass> {
    T obj1;

    public TheBoundedGen(T obj1) {
        this.obj1 = obj1;
    }
}

class TheBoundedGenDemo{
    public static void main(String args[]){

        //TheBoundedGen<DClass> theBoundedGen = new TheBoundedGen<>(new DClass());//Error because DClass is not within the bound

        TheBoundedGen<CClass> theBoundedGen = new TheBoundedGen<>(new CClass());//No error
    }
}