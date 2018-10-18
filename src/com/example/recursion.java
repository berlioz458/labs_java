package com.example;

public class recursion {

    public static int factorial(int x)
    {
        if (x == 1)
        {
            return 1;
        }else
        {
            return x * factorial(x - 1);
        }
    }


    public static void main(String[] args) {
        int X;
        X = factorial(11);
        System.out.println(X);
    }
}
