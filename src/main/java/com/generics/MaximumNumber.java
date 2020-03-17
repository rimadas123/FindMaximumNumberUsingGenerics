package com.generics;

public class MaximumNumber <E extends Comparable<E>> {

    // Welcome message
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum number using generics");
    }

    // variables
    private E first;
    private E second;
    private E third;
    private E testMaximum;

    // default constructor
    public MaximumNumber(){};

    // parameterized constructor
    public MaximumNumber(E first,E second,E third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

    //given three arguments and compute maximum among them using generic method
    public static <E extends Comparable<E>> E findMaximum(E first, E second, E third){
        E max=first;
        if(second.compareTo(max)>0){
            max=second;
        }
        if(third.compareTo(max)>0){
            max=third;
        }
        return max;
    }

    //method that call another method internally
    public E findMaximum(){
        testMaximum =findMaximum(first,second,third);
        return testMaximum;
    }
}