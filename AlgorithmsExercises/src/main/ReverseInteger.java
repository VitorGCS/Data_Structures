package main;

public class ReverseInteger {

    public static int algorithm(int x){
        int MINVALUE = -231;
        int MAXVALUE = 231;

        if(x > MAXVALUE || x < MINVALUE)
            return 0;
        int thirdDigit = x/100; //First digit
        int twoDigitsLeft = x%100;
        int secondDigit = twoDigitsLeft/10;
        int firstDigit = twoDigitsLeft%10;

        if(thirdDigit != 0)
            return firstDigit*100 + secondDigit*10 + thirdDigit;
        else if(secondDigit != 0 ){
            return firstDigit*10 + secondDigit;
        }
        return x;
    }

    /*
    public static int algorithm(int x){
        long out = 0;
        while (x != 0){
            out = out*10 + x%10;
            x = x/10;
        }
        if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)
            return 0;

        return (int) out;
    }
    */
}
