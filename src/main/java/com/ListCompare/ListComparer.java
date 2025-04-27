package com.ListCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListComparer {
    public Pair<Long, Long> addCompare(int elementsCount) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        addElements(arrayList, elementsCount);
        endTime = System.nanoTime();
        long arrayListDuration = (endTime - startTime);

        startTime = System.nanoTime();
        addElements(linkedList, elementsCount);
        endTime = System.nanoTime();
        long linkedListDuration = (endTime - startTime);

        return new Pair<>(arrayListDuration, linkedListDuration);
    }

    public void addElements(List<Integer> list, int elements_count) {
        for (int i = 0; i < elements_count; ++i) {
            list.add(i);
        }
    }
}
