package test;

import main.ReverseInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestReverseInteger {

    @Test
    public void TestReverseIntegerWhenOneDigit(){
        Assertions.assertEquals(1, ReverseInteger.algorithm(1));
    }

    @Test
    public void TestReverseIntegerWhenTwoDigit(){
        Assertions.assertEquals(21,ReverseInteger.algorithm(12));
    }

    @Test
    public void TestReverseIntegerWhenThreeDigit(){
        Assertions.assertEquals(321,ReverseInteger.algorithm(123));
    }

    @Test
    public void TestReverseIntegerWhenThreeDigitOverflows(){
        Assertions.assertEquals(0,ReverseInteger.algorithm(232));
    }

    @Test
    public void TestReverseIntegerWhenFourDigit(){
        Assertions.assertEquals(0,ReverseInteger.algorithm(1111));
    }
}
