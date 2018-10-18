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

    public static int summ_index (ArrayList list)
    {
        if (list.size() == 1)
        {

            return 1;
        }
        else
        {

            list.remove(0);
            return 1 + summ_index(list);
        }
    }

    public static int max_index (ArrayList array) {
        /*if (array.size() == 2)
        {
            return (int)((int)array.get(0) > (int)array.get(1) ? array.get(0) : array.get(1));
        }
        array.remove(0);
        ArrayList l2 = array;
        int sub_max = max_index(l2);
        return (int)array.get(0) > sub_max ? (int) array.get(0) : sub_max;*/
        //какая-то херня
        return 0;
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
        A.add(3);
        //int SUMMA = summa_array(A);
        //System.out.println(SUMMA);
        int B = 0;
        //int INDEX = summ_index(A);
        //System.out.println(INDEX);
        int M = max_index(A);
        System.out.println(M);
    }
}
