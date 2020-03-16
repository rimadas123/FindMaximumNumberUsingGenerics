package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        int firstInt = 89, secondInt = 96, thirdInt = 70;
        if(firstInt>secondInt && firstInt > thirdInt){
            System.out.println("Maximum number is "+firstInt);
        } else if(secondInt>firstInt && secondInt > thirdInt) {
            System.out.println("Maximum number is "+secondInt);
        } else {
            System.out.println("Maximum number is "+thirdInt);
        }
    }
}
