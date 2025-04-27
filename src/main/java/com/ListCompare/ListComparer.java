package com.ListCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Class for comparing performance of add, remove and get operations
 * between ArrayList and LinkedList.
 */
public class ListComparer {
    /**
     * Compares element addition time between ArrayList and LinkedList.
     *
     * @param elementsCount number of elements to add
     * @return pair of values where firstValue is time for ArrayList (ns),
     *         secondValue is time for LinkedList (ns)
     */
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

    /**
     * Compares element removal time between ArrayList and LinkedList.
     *
     * @param elementsCount number of elements to remove
     * @return pair of values where firstValue is time for ArrayList (ns),
     *         secondValue is time for LinkedList (ns)
     */
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

    /**
     * Compares element access time between ArrayList and LinkedList.
     *
     * @param elementsCount number of elements to access
     * @return pair of values where firstValue is time for ArrayList (ns),
     *         secondValue is time for LinkedList (ns)
     */
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

    /**
     * Adds elements to a list.
     *
     * @param list list to add elements to
     * @param elementsCount number of elements to add
     */
    private void addElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.add(i);
        }
    }

    /**
     * Removes elements from a list.
     *
     * @param list list to remove elements from
     * @param elementsCount number of elements to remove
     */
    private void delElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.removeFirst();
        }
    }

    /**
     * Accesses elements in a list.
     *
     * @param list list to access elements from
     * @param elementsCount number of elements to access
     */
    private void getElements(List<Integer> list, int elementsCount) {
        for (int i = 0; i < elementsCount; ++i) {
            list.get(i);
        }
    }
}
