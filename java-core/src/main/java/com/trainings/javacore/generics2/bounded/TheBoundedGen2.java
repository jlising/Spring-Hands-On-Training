package com.trainings.javacore.generics2.bounded;

/**
 * @author jlising - 3/7/16.
 */
class TheBoundedGen2<T extends AClass, V extends BClass> {
}

class TheBoundedGen2Demo{
    public static void main(String arg[]){
        TheBoundedGen2<AClass, CClass> theBoundedGen2 = new TheBoundedGen2<>();

        //TheBoundedGen2<AClass, AClass> theBoundedGen2 = new TheBoundedGen2<>(); Error, the second AClass param is not within the bound
    }
}

