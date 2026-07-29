package com.nihal.example.calcapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculation {

    Logger logger = LoggerFactory.getLogger(Calculation.class);
    public double add(double a, double b) {
        logger.debug("Adding " + a + " + " + b);
        return a + b;
    }
    public double sub(double a, double b) {
        logger.debug("Subtracting " + a + " - " + b);
        return a - b;
    }
    public double mul(double a, double b) {
        logger.debug("Multiplying " + a + " * " + b);
        return a * b;
    }
    public double div(double a, double b) {
        logger.debug("Dividing " + a + " / " + b);
        return a / b;
    }

    public double pow(double a, double b) {
        logger.debug("Powing " + a + " * " + b);
        return Math.pow(a, b);
    }
}
