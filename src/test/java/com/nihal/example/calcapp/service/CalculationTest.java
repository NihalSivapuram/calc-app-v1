package com.nihal.example.calcapp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationTest {
    Calculation calc;
    Logger logger = LoggerFactory.getLogger(CalculationTest.class);

    @BeforeEach
    public void setUp() {
        logger.info("setUp : initiated and service instantiated");
        calc = new Calculation();
    }
    @Test
    public void testAdd(){

        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(10, calc.add(5, 5));
    }
    @Test
    public void testSubtract(){

        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(1, calc.sub(5, 4));
    }

    @Test
    public void testMultiply(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(10, calc.mul(2,5));
    }

    @Test
    public void testDivide(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(5, calc.div(10,2));
    }

    @AfterEach
    public void tearDown() {
        logger.info("tearDown : initiated and service instance destroyed");
        calc = null;
    }

}
