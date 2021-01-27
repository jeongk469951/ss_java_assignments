package com.ss.jkim.day04.part2;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    Line lineTest = new Line(1,2,3,4);
    Line lineTestTwo = new Line(3,4,5,8);
    Line lineTestThree = new Line(3,4,5,6);
    Line lineTestFour = new Line(1,3,1,4);

    @org.junit.jupiter.api.Test
    void getSlope() {

        assertThrows(ArithmeticException.class , () -> lineTestFour.getSlope());
        assertEquals(1,lineTest.getSlope(),0.0001);
        assertEquals(2,lineTestTwo.getSlope(),0.0001);
        assertNotEquals(2,lineTest.getSlope(), 0.0001);


    }

    @org.junit.jupiter.api.Test
    void getDistance() {

        assertEquals(2.8284,lineTest.getDistance(),0.0001);
        assertEquals(4.4721,lineTestTwo.getDistance(),0.0001);
        assertNotEquals(2.2616,lineTest.getSlope(), 0.0001);

    }

    @org.junit.jupiter.api.Test
    void parallelTo() {
        assertEquals(true, lineTest.ParallelTo(lineTestThree));
        assertEquals(true, lineTestThree.ParallelTo(lineTest));
        assertNotEquals(false, lineTest.ParallelTo((lineTestThree)));
    }
}