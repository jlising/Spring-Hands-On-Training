package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
interface I3 {}

interface I4 {}

interface II extends I3, I4 {}

/**
 which one of the following will compile without errors?
 a) interface II implements I3, I4 {}
 b) interface II implements I3 implements I4 {}
 c) interface II implements I3 extends I4 {}
 d) interface II extends I3, I4 {}
 */