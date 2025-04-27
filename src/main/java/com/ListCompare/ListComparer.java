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

    public Pair<Long, Long> delCompare(int elementsCount) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        addElements(arrayList, elementsCount);
        addElements(linkedList, elementsCount);
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        delElements(arrayList, elementsCount);
        endTime = System.nanoTime();
        long arrayListDuration = (endTime - startTime);

        startTime = System.nanoTime();
        delElements(linkedList, elementsCount);
        endTime = System.nanoTime();
        long linkedListDuration = (endTime - startTime);

        return new Pair<>(arrayListDuration, linkedListDuration);
    }

    public Pair<Long, Long> getCompare(int elementsCount) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        addElements(arrayList, elementsCount);
        addElements(linkedList, elementsCount);
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        getElements(arrayList, elementsCount);
        endTime = System.nanoTime();
        long arrayListDuration = (endTime - startTime);

        startTime = System.nanoTime();
        getElements(linkedList, elementsCount);
        endTime = System.nanoTime();
        long linkedListDuration = (endTime - startTime);

        return new Pair<>(arrayListDuration, linkedListDuration);
    }

    private void addElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.add(i);
        }
    }

    private void delElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.removeFirst();
        }
    }

    private void getElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.get(i);
        }
    }
}
