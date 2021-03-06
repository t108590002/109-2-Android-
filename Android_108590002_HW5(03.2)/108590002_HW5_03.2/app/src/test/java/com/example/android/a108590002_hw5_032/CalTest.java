package com.example.android.a108590002_hw5_032;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)

public class CalTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersWorksWithNegativeResult() {
        double resultAdd = mCalculator.add(-1d, -17d);
        assertThat(resultAdd, is(equalTo(-18d)));
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111d, 1.111d);
        assertThat(resultAdd, is(equalTo(2.222)));
    }

    @Test
    public void addTwoNumbersBignums() {
        double resultAdd = mCalculator.add(123456781d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567892d)));
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

    @Test
    public void mulWorksWithNegativeResult() {
        double resultMul = mCalculator.mul(32d, -2d);
        assertThat(resultMul, is(equalTo(-64d)));
    }

    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    @Test
    public void divWorksWithNegativeResult() {
        double resultDiv = mCalculator.div(-32d, 2d);
        assertThat(resultDiv, is(equalTo(-16d)));
    }

    @Test
    public void divByZeroThrows() {
        try{
            double resultDiv = mCalculator.div(0,32d);
        }catch(Exception e){
            System.out.println(("error"));
        }
    }

    @Test
    public void powTwoNumbers() {
        double resultPow = mCalculator.pow(2d, 3d);
        assertThat(resultPow, is(equalTo(8d)));
    }

    @Test
    public void powWorksWithNegativeResult1() {
        double resultPow = mCalculator.pow(-1d, 3d);
        assertThat(resultPow, is(equalTo(-1d)));
    }

    @Test
    public void powWorksWithNegativeResult2() {
        double resultPow = mCalculator.pow(10d, -1d);
        assertThat(resultPow, is(equalTo(0.1d)));
    }

    @Test
    public void powWorksWithZero1() {
        double resultPow = mCalculator.pow(0, 2d);
        assertThat(resultPow, is(equalTo(0d)));
    }

    public void powWorksWithZero2() {
        double resultPow = mCalculator.pow(2d, 0);
        assertThat(resultPow, is(equalTo(1d)));
    }

    public void powWorksWithZero3() {
        try{
            double resultDiv = mCalculator.div(0,-2d);
        }catch(Exception e){
            System.out.println(("error"));
        }
    }

    public void powWorksWithZero4() {
        double resultPow = mCalculator.pow(-0, 2d);
        assertThat(resultPow, is(equalTo(0d)));
    }
}