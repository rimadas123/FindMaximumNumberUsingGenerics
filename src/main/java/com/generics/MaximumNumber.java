package com.generics;

public class MaximumNumber {

    // Welcome message
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum number using generics");
    }

    // Calculate maximum number of an integer
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

    //Calculate maximum number of floats
    public Double maxNumberFloat(Double firstNumber,Double secondNumber,Double thirdNumber){
        Double max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
            max=thirdNumber;
        }
        return max;
    }
}