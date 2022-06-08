package main;

public class TwoSum {

    public static int[] TwoSum(int [] values, int target){
        for (int i=0; i<values.length; i++ ) {
            for(int subI= i+1; subI < values.length; subI++){
                if(values[i] + values[subI] == target)
                    return new int[]{i, subI};
            }
        }
        return null;
    }
}

