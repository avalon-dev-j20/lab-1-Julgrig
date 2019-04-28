package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Iterator;

/**
 * Задание №3
 * <p>
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {

        Fibonacci fibonacci = new Fibonacci(20); // Task 3 # 2
        int sum = 0;
        for (Integer value : fibonacci) {
            sum += value;  // Task 3 # 3  сумма  чисел последовательности Фибоначчи:
        }

        System.out.println(sum);



        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс  СДЕЛАНО
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов. СДЕЛАНО
         *
         * 3. Найти сумму полученных значений. СДЕЛАНО
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания. СДЕЛАНО
         */
    }
}
