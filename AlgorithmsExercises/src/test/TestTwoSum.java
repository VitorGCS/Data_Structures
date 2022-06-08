package test;

import main.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TestTwoSum {

    @Test
    public void testTwoSumWhenDontExist(){
        Assert.assertNull(TwoSum.TwoSum(new int[]{1,0,11}, 22));
    }

    @Test
    public void testTwoSumWhenZeroSeqStart(){
        Assert.assertArrayEquals( new int[]{0,1}, TwoSum.TwoSum(new int[]{0,0,11}, 0) );
    }

    @Test
    public void testTwoSumWhenZeroSeqEnd(){
        Assert.assertArrayEquals( new int[]{1,2}, TwoSum.TwoSum(new int[]{11,0,0}, 0) );
    }

    @Test
    public void testTwoSumWhenThreeNotSeq(){
        Assert.assertArrayEquals( new int[]{0,2}, TwoSum.TwoSum(new int[]{1,0,2}, 3) );
    }

    @Test
    public void testTwoSumWhenNineFirstSeq(){
        Assert.assertArrayEquals( new int[]{0,1}, TwoSum.TwoSum(new int[]{2,7,11,15}, 9) );
    }

    @Test
    public void testTwoSumWhenNineNotSeq(){
        Assert.assertArrayEquals( new int[]{0,2}, TwoSum.TwoSum(new int[]{2,11,7,15}, 9) );
    }

    @Test
    public void testTwoSumWhenNineNotSeqHard(){
        Assert.assertArrayEquals( new int[]{0,5}, TwoSum.TwoSum(new int[]{2,11,5,4,1,7,15,4,5}, 9) );
    }
}
