package com.example;

import java.util.ArrayList;

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

    public static int summa_array (ArrayList array)
    {
        int summ;
        if (array.size() == 0)
        {
            summ = 0;
            return summ;
        }else
        {
            summ= (int) array.get(0);
            array.remove(0);
            return summ + summa_array(array);
        }

        //return (int) summa_array(array[array.length-1]);
    }

    public static void main(String[] args) {
        int X;
        X = factorial(11);
        //System.out.println(X);
        ArrayList A = new ArrayList();
        A.add(1);
        A.add(6);
        A.add(3);
        A.add(9);
        A.add(8);
        int SUMMA = summa_array(A);
        System.out.println(SUMMA);
    }


}
