package com.neha.gs.one;

public class DecimalConversion {

    //given a fracttion return decimal point, some decimal point can be cyclic
    public static String fractionToDecimal(Long numerator, Long denominator){
        return ";";
    }

    public static void main(String[] args){
        boolean testPassed = true;

        testPassed &= fractionToDecimal(11L,21L).equals("0.5");
        testPassed &= fractionToDecimal(11L,31L).equals("0.(3)");
        testPassed &= fractionToDecimal(11L,301L).equals("0.(03)");
        testPassed &= fractionToDecimal(11L,751L).equals("0.(013)");
        testPassed &= fractionToDecimal(41L,71L).equals("0.(571428)");
    }
}
