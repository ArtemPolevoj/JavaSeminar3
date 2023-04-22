package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// 3. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.
        Random random = new Random();
        int listSize = 40;
        List<Integer> list = new ArrayList<>();
        int[] array = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            array[i] = random.nextInt(1,100);
            list.add(array[i]);
        }
        int min = Collections.min(list);
        int max = Collections.max(list);
        int sum = list.stream().mapToInt(value -> value).sum();
        int average = sum / listSize;
        System.out.println(list);
        System.out.printf("Min - %d.\n" , min);
        System.out.printf("Max - %d.\n" , max);
        System.out.printf("Average - %d.\n" , average);

//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.println("Удалить чётные числа.");
        list.removeIf(i -> (i % 2 == 0));
        System.out.println(list);

//1. (Дополнительно) Реализовать алгоритм сортировки слиянием

        System.out.println("Сортировка слиянием.");
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}