package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_table {
    public static void main(String[] args) {
        HashMap<String, String> Call_book= new HashMap<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            Call_book.put(in.next(),in.next());
        }

        System.out.println(Call_book);

        String index = "vxod"; // надо придумать нормальный выход из цикла while
        while (!index.equals("exit"))
        {
            index = in.next();
            System.out.println(Call_book.get(index));
        }

    }
}


//5.1 f(x) = 1 - последовательная, для каждого X будет один и тот же ответ 1
//5.2 f(x) = rand() - не последовательная, есть доля вероятности получить два одинаковых значения
//5.3 f(x) = next_empty_slot() - не последовательная, на одно и то же значение я буду получать разные индексы
//5.4 f(x) = len(x) - последовательная
//HashMap - это реализованные уже в Java хеш-таблицы
//containsKey - поиск по ключу (true/false)
//containsValue - поиск по значению (true/false)