package com.ListCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListComparer {
    public Pair<Long, Long> addCompare(int elements_count) {
        LinkedList<Integer> linked_list = new LinkedList<>();
        ArrayList<Integer> array_list = new ArrayList<>();
        long startTime = System.nanoTime();
        addElements(array_list, 1000000);
        long endTime = System.nanoTime();
        long linked_list_duration = (endTime - startTime);
        startTime = System.nanoTime();
        addElements(array_list, 1000000);
        endTime = System.nanoTime();
        long array_list_duration = (endTime - startTime);
        return new Pair<>(linked_list_duration, array_list_duration);
    }

    public void addElements(List<Integer> list, int elements_count) {
        for (int i = 0; i < elements_count; ++i) {
            list.add(i);
        }
    }
}
