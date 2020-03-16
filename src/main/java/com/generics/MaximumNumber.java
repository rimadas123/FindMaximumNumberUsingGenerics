package com.generics;

public class MaximumNumber {

    // Welcome message
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum number using generics");
    }

    //given three arguments and compute maximum among them
    public static <E extends Comparable<E>> E findMaximum(E first,E second,E third){
        E max=first;
        if(second.compareTo(max)>0){
            max=second;
        }
        if(third.compareTo(max)>0){
            max=third;
        }
        return max;
    }
}