package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] Algorithm(int [] values, int target){
        for (int i=0; i<values.length; i++ ) {
            for(int subI= i+1; subI < values.length; subI++){
                if(values[i] + values[subI] == target)
                    return new int[]{i, subI};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    /*
    public static int[] Algorithm(int [] values, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i < values.length; i++){
            int complement = target - values[i];
            if( map.containsKey(complement)){
                return new int[]{ map.get(complement), i};
            }
            map.put(values[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
     */
}

