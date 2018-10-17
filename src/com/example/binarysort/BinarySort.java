package com.example.binarysort;
import java.awt.event.MouseAdapter;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;

public class BinarySort {

    public static int binary_search(int a[], int X)
    {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while (low <= high)
        {
            mid = (low + high) / 2;
            int guess = a[mid];
            if (guess == X)
            {
                System.out.println(mid);
                return mid;
            }
            if (guess < X)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }


        }
        return 0;

    }

    public static int[] create_array(int N)
    {
        int []B;
        B = new int [N];
        for (int i = 0; i < B.length; i++)
        {
            B[i] = (int) (Math.random() * N);
        }
        return B;
    }

    public static int[] sort_array(int []N)
    {

        return N;
    }

    public static void O_O (int N)
    {
        int Binary_search_shagi;
        Binary_search_shagi = (int) (Math.log(N)/Math.log(2));
        System.out.println(Binary_search_shagi);
    }

    public static void print_array(int []A)
    {
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(i + ":" + A[i] + "   ");
            if (i%3 == 0)
            {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int []A = new int [20];
        A = create_array(20);
        print_array(A);
        //A = sort_array(A);

        /*Scanner in = new Scanner(System.in);
        int Magic = in.nextInt();

        binary_search(A, Magic);
        O_O(Magic);
        O_O(1000000000);*/
    }

}

