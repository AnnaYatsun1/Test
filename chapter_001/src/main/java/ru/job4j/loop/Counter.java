package ru.job4j.loop;

/**
 * Created by Анна on 03.09.2017.
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

