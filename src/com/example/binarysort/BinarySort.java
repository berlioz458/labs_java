package com.example.binarysort;
import java.awt.event.MouseAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class BinarySort {

    public static int binary_search(ArrayList a, int X)
    {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;

        while (low <= high)
        {
            mid = (low + high) / 2;
            int guess = (int)a.get(mid);
            if (guess == X)
            {
                System.out.println("Position: " + mid);
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

    public static ArrayList create_array(int N)
    {
        ArrayList B = new ArrayList(N);
        int a;
        for (int i = 0; i < N; i++)
        {
            a = (int) Math.round((Math.random() * N));
            B.add(a);
        }
        return B;
    }

    public static void O_O (int N)
    {
        int Binary_search_shagi;
        Binary_search_shagi = (int) (Math.log(N)/Math.log(2));
        System.out.println(Binary_search_shagi);
    }

    public static void print_array(ArrayList A)
    {
        System.out.println("============================================================================================================================================================================");
        for (int i = 0; i < A.size(); i++)
        {

            System.out.print(A.get(i) + " ||");
        }
        System.out.println("\n============================================================================================================================================================================");
    }

    public static int min(ArrayList a)
    {
        int index = 0;
        int small = (int) a.get(0);

        for (int i = 1; i < a.size(); i++) {
            if ((int)a.get(i) < small) {
                small = (int)a.get(i);
                index = i;
            }
        }
        return index;
    }

    public static ArrayList sort_array(ArrayList N)
    {
        int smallest;
        ArrayList Array = new ArrayList();
        int X = (int)N.size();
        for (int i = 0; i < X; i++)
        {
            smallest = min(N);
            Array.add(N.get(smallest));
            N.remove(smallest);
        }
        return Array;
    }


    public static void main(String[] args) {
        //int []A = new int [20];
        ArrayList A = new ArrayList();
        A = create_array(20);
        print_array(A);
        A = sort_array(A);
        print_array(A);
        Scanner in = new Scanner(System.in);
        int Magic = in.nextInt();

        binary_search(A, Magic);
        /*O_O(Magic);
        O_O(1000000000);*/
    }

}

