package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>(); // Task 5# 1
        Set<Integer> set =  new HashSet<>();  // Task 5# 1

        for (Integer i : array) {     //Task 5 # 2
            list.add(i);
            set.add(i);
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов. СДЕЛАНО
         *
         * 2. В обе коллекции поместите элементы массива array.
         * СДЕЛАНО
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания. СДЕЛАНО
         */
    }
}
