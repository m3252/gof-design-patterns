package com.study.designpatterns.seungchan_moon._21_strategy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StrategyInJava {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);

        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(numbers);

        Collections.sort(numbers, Comparator.comparingInt(o -> o));
        System.out.println(numbers);

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        Collections.sort(numbers, Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
