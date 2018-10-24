package com.example;

import java.util.HashMap;

public class Hash_table {

    public static void batery()
    {
        HashMap<String,Double> Batery = new HashMap<>();
        Batery.put("AA", 1.5);
        Batery.put("A", 12.0);
        Batery.put("AAA", 1.2);
        Batery.put("AAAA", 1.5);

        System.out.println(Batery);
        System.out.println(Batery.get("AAA"));
    }
    
    public static void book()
    {
        HashMap<String,String> Book = new HashMap<>();
        Book.put("маус", "Арт Шпигельман");
        Book.put("Fun Home", "Элисон Бекдел");
        Book.put("Хранители", "Alan Moore");

        System.out.println(Book);
        System.out.println(Book.get("Хранители"));
    }

    public static void print_hash(HashMap h1)
    {
        for(int k = 0; k < h1.size(); k++)
        {
            System.out.println(k + ": " + h1.get(k));
        }
    }

    public static void main(String[] args) {
        /*HashMap<Integer, String> Call_book= new HashMap<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            Call_book.put(in.nextInt(),in.next());
        }
        System.out.println(Call_book);
        print_hash(Call_book); //криво вынесено в отдельную функцию вывода, чтобы с каждой строки была новая пара
        /*String index = "vxod"; // надо придумать нормальный выход из цикла while
        while (!index.equals("exit"))
        {
            index = in.next();
            System.out.println(Call_book.get(index));
        }*/

        //batery();
        book();
    }
}


//5.1 f(x) = 1 - последовательная, для каждого X будет один и тот же ответ 1
//5.2 f(x) = rand() - не последовательная, есть доля вероятности получить два одинаковых значения
//5.3 f(x) = next_empty_slot() - не последовательная, на одно и то же значение я буду получать разные индексы
//5.4 f(x) = len(x) - последовательная
//HashMap - это реализованные уже в Java хеш-таблицы
//containsKey - поиск по ключу (true/false)
//containsValue - поиск по значению (true/false)


//10 элементов : 1 - плохое распределение, 2 - плохое, 3 - плохое/среднее, 4 - нормальное
//5.5. уже сделано выше
//5.6. batery()
//5.7. book()