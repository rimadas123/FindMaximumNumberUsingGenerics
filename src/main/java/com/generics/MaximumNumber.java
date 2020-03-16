package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum number using generics");
    }
    public Integer maxNumberInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber){
        Integer max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
            max=thirdNumber;
        }
        return max;
    }
}