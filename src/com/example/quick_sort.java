package com.example;

import java.util.ArrayList;

public class quick_sort {


    public static ArrayList quick_sorting(ArrayList A)
    {
        if (A.size() < 2)
        {
            return A;
        }
        else
        {
            int pivot = (int) A.get(0);
            ArrayList less = new ArrayList();
            ArrayList greate = new ArrayList();
            for (int i = 1; i < A.size(); i++)
            {
                if ((int)A.get(i) < pivot)
                {
                    less.add(A.get(i));
                }
                if ((int)A.get(i) > pivot)
                {
                    greate.add(A.get(i));
                }
            }
            ArrayList Result = new ArrayList();
            Result.add(quick_sorting(less));
            Result.add(pivot);
            Result.add(quick_sorting(greate));


            return Result;
        }

    }

    public static void main(String[] args) {
        ArrayList AAA = new ArrayList();;
        AAA.add(2);
        AAA.add(1);
        AAA.add(14);
        AAA.add(8);
        AAA.add(5);
        AAA.add(3);
        ArrayList BBB = quick_sorting(AAA);
        for (int k = 0; k < BBB.size(); k++)
        {
            System.out.print(BBB.get(k) + ", ");
        }
    }
}
