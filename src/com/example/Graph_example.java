package com.example;

import java.util.Arrays;
import java.util.HashMap;

public class Graph_example {

    public void print_matrix(int[][] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A.length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] Matrix = {{0, 1, 1, 1, 1, 0},
                        {1, 0, 0, 1, 0, 0},
                        {1, 0, 0, 0, 1, 0},
                        {1, 1, 0, 0, 0, 0},
                        {1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};

        //надо научиться строить матрицу смежности: на входе граф считать ходы в Hashmap, собрать все key и по ним составить матрицу key*key. Если есть пара key на value то писать 1 в матрицу. Изначально нули.

        HashMap<String, String[]> tupo = new HashMap<>();
        tupo.put("я", new String[]{"мама", "папа"});
        System.out.println(tupo + " " + Arrays.toString(tupo.get("я")));


    }

}
