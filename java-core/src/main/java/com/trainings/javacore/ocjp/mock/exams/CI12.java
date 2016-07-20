package com.trainings.javacore.ocjp.mock.exams;

/**
 * Created by jlising on 1/21/16.
 */
interface I1 {}

interface I2 {}

abstract class C {}

class CI12 extends C implements I1, I2 {}

/**
 which one of the following will compile without errors?
 a) class CI12 extends C, I1, I2 {}
 b) class CI12 implements C extends I1, I2 {}
 c) class CI12 implements C, I1, I2 {}
 d) class CI12 extends C implements I1, I2 {}
 e) class CI12 extends C implements I1 implements I2 {}
 f) class CI12 implements C extends I1 extends I2 {}
**/