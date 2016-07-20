package com.trainings.javacore.draft;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jlising on 2/21/16.
 */
public class Test2 {

    static List<Integer> aList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    static List<Integer> bList = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));



    public static void main(String args[]){
        List<Integer> union = new ArrayList(aList);

        union.addAll(bList);

        List<Integer> intersection = new ArrayList(aList);
        intersection.retainAll(bList);

        List<Integer> symmetricDifference = new ArrayList(union);
        symmetricDifference.removeAll(intersection);

        System.out.println("aList: " + aList);
        System.out.println("bList: " + bList);
        System.out.println("union: " + union);
        System.out.println("intersection: " + intersection);
        System.out.println("**symmetricDifference: " + symmetricDifference+"**");
    }
}
