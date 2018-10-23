package com.example;

import java.util.HashMap;

public class Hash_table {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_table = new HashMap<>();
        hash_table.put(4, "IVANOV IVAN");
        hash_table.put(1, "DROVENKO MAKSIM");


        System.out.println(hash_table.get(1));
        System.out.println(hash_table);
    }
}


//5.1 f(x) = 1 - последовательная, для каждого X будет один и тот же ответ 1
//5.2 f(x) = rand() - не последовательная, есть доля вероятности получить два одинаковых значения
//5.3 f(x) = next_empty_slot() - не последовательная, на одно и то же значение я буду получать разные индексы
//5.4 f(x) = len(x) - последовательная