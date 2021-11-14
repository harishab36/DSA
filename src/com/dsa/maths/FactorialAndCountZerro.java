package com.dsa.maths;

public class FactorialAndCountZerro {
    public static void main(String[] a){
        Factorial find = new Factorial();
        int number = 10;
        System.out.println("Factorial of "+number+" is "+find.factorialOf(number)+" Number of 0's "+find.totalZeros());
    }
}

class Factorial{
    long factorial = 1;
    public long factorialOf(int number){
        if (number == 0){
            return factorial;
        }

        for (int i =number;i>0;i--){
            factorial *= i;
        }
        return factorial;
    }

    public int totalZeros(){
        int numOfZeros = 0;
        if (factorial == 1){
            return numOfZeros;
        }

        long value = factorial;

        while (value > 0){
            if (value % 10 == 0){
                numOfZeros++;
            }
            value /= 10;
        }
        return numOfZeros;
    }
}


