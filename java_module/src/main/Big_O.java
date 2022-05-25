package main;

/*
* Types of notation:
*  -> Big O - O(N)
*  -> Big Theta - Ω(N)
*  -> Big Omega - Θ(N)
* */


public class Big_O {

    /*
    The Big(o) notation is used to measure the efficiency/performance of algorithms in terms of:
     -> Runtime complexity of the method/algorithm
     -> Space complexity  of the method/algorithm

    Asymptotic analysis of an algorithm is a method used to evaluate the performance of an algorithm in terms of input size,
    we can very well conclude the follow scenarios :
    - best case;
    - average/expected case;
    - worst case

    In other words, we use asymptotic analysis to determine the time and space increase when the input size also increases,
    in an ideal world we want our algorithms to be super fast and scalable and take minimum amount of memory but unfortunately
    that hardly if ever happens, most of the time we have to do a trade-off between saving time and saving space.

    ###################################################################################################################
    Runtime complexity of the method/algorithm: how much an algorithm slows down as the input grows larger
    We use the Big O notation to understand how much the cost of an algorithm increases, all we need is an approximation not as an exact value

    O(1) => doesn't matter how big the data structure is,
            the execution of the method/algorithm is constant an amount of time to run

    O(n) => the size of the data structure matters, the cost of the algorithm grows linearly and in direct correlation
            to the size of the input (ex: Linear search)

    O(n^2) => the runtime complexity of this method increase in quadratic time, this kind of algorithms gets slower than O(n)

    O(log n) => the runtime complexity of this method increase in a logarithmic growth rate: This kind of algorithmic time
    is more efficient and more scalable than an algorithm that runs in linear or quadratic time (ex: Binary search)

    O(2^n) =>  the runtime complexity of this method increase exponential (is the opposite of the logarithmic growth)
    this kind of algorithm is not scalable at all it will become very slow very soon.


     ###################################################################################################################


     Sorted for performance best to worst grows rates:
     O(1) - constant
     O(log n) - logarithmic
     O(n) - linear
     O(n^2) - quadratic
     O(2^n) - exponential

     */

}
