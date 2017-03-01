package com.example.calculator;

import info.novatec.testit.livingdoc.reflect.annotation.FixtureClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Fixture class for acceptance test.
 */
@FixtureClass("CalculatorTest")
@SuppressWarnings("unused")
public class CalculatorFixture {

    private int value1;
    private int value2;

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int addition() {
        return value1 + value2;
    }

    public int subtraction() {
        return value1 - value2;
    }

    public int multiplication() {
        return value1 * value2;
    }

    public double division() {
        return new BigDecimal(value1).divide(new BigDecimal(value2), RoundingMode.FLOOR).doubleValue();
    }
}
