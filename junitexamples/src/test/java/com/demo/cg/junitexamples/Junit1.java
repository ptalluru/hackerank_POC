package com.demo.cg.junitexamples;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Junit1 {

    @BeforeAll
    static void initAll() {
    	System.out.println("Inside initAll @BeforeAll");
    }

    @BeforeEach
    void init() {
    	System.out.println("Inside init @BeforeEach");
    }

    @org.junit.jupiter.api.Test
    void succeedingTest() {
    	System.out.println("Inside succeedingTest");
    }

    @org.junit.jupiter.api.Test
    void failingTest() {
    	 assumeTrue("abc".contains("e"));
        fail("a failing test");
    }

    @org.junit.jupiter.api.Test
   // @Disabled("for demonstration purposes")
    void skippedTest() {
    	System.out.println("Inside skippedTest");
    	ass
        // not executed
    }

    @Test
    void abortedTest() {
    	System.out.println("Inside abortedTest");
        assumeTrue("abc".contains("b"));
        //fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
    	System.out.println("Inside tearDown @AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
    	System.out.println("Inside tearDownAll @AfterAll");
    }

}