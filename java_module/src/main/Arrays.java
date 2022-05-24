package main;

public class Arrays {

    /*

    Arrays keeping tracking every cell location so they can instantly compute the location of any item inside of it

    => positive points:
    - retrieving items

    => negative points:
    - adding items isn't always too efficient because  we might have to move our array to a new place so it fits,
    we need to declare the size of the array in advance

    */


    String ArrayDescription(){
        return "Continuous block of cells in the computer memory by";
    }
    String dataStructureInTest(){
        return "Array";
    }

    public void log(int [] numbers){
        // O(1)
        System.out.println(numbers[0]);
    }

    public void log2(int [] numbers){
        // O(n)
        for(int number: numbers)
            System.out.println(number);
    }

    public void log3(int [] numbers, String[] names ){
        // O(n) == O( n + m) : the runtime complexity of this method increases linearly

        for(int number: numbers) // O(n)
            System.out.println(number);

        for(String name: names) // O(m)
            System.out.println(name);
    }

    public void log4(int [] numbers ){
        // O(n x n) == O(n^2): the runtime complexity of this method increase in quadratic time

        for(int first: numbers) // O(n)
            for(int second: numbers) // O(n)
                System.out.println(first + ", "+second);
    }

    public static void main(String []args){
        System.out.println("Hello World");
    }
}
