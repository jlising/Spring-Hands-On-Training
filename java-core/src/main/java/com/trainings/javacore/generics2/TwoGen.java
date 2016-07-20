package com.trainings.javacore.generics2;

/**
 * @author jlising - 3/7/16.
 */
class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // Show types of T and V.
    void showTypes() {
        System.out.println("Type of T is " +
                ob1.getClass().getName());
        System.out.println("Type of V is " +
                ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

// Demonstrate TwoGen.
class TwoGenDemo {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Show the types.
        tgObj.showTypes();

        // Obtain and show values.
        int v = tgObj.getob1();

        System.out.println("value: " + v);
        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}