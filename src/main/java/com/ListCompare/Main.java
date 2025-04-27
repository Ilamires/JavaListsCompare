package com.ListCompare;

public class Main {
    public static void main(String[] args) {
        ListComparer listComparer = new ListComparer();
        printCompareTable(listComparer.addCompare(10000000),
                listComparer.delCompare(100000), listComparer.getCompare(100000));
    }

    public static void printCompareTable(Pair<Long, Long> addCompareResult, Pair<Long, Long> delCompareResult,
                                         Pair<Long, Long> getCompareResult) {
        String arrayListAddResult = Double.toString(addCompareResult.firstValue() / 1000000.0);
        String linkedListAddResult = Double.toString(addCompareResult.secondValue() / 1000000.0);
        int addStringLength = Math.max(arrayListAddResult.length(), linkedListAddResult.length());
        addStringLength = Math.max(addStringLength, 3);

        String arrayListDelResult = Double.toString(delCompareResult.firstValue() / 1000000.0);
        String linkedListDelResult = Double.toString(delCompareResult.secondValue() / 1000000.0);
        int delStringLength = Math.max(arrayListDelResult.length(), linkedListDelResult.length());
        delStringLength = Math.max(delStringLength, 6);

        String arrayListGetResult = Double.toString(getCompareResult.firstValue() / 1000000.0);
        String linkedListGetResult = Double.toString(getCompareResult.secondValue() / 1000000.0);
        int getStringLength = Math.max(arrayListGetResult.length(), linkedListGetResult.length());
        getStringLength = Math.max(getStringLength, 3);

        int[] columnWidths = {
                10,
                addStringLength,
                delStringLength,
                getStringLength
        };

        String horizontalLine = "+" + "-".repeat(columnWidths[0] + 2)
                + "+" + "-".repeat(columnWidths[1] + 2)
                + "+" + "-".repeat(columnWidths[2] + 2)
                + "+" + "-".repeat(columnWidths[3] + 2)+ "+";

        String[] row = new String[4];
        System.out.println(horizontalLine);
        row[0] = "";
        row[1] = "add";
        row[2] = "delete";
        row[3] = "get";
        printTableRow(row, columnWidths);

        System.out.println(horizontalLine);
        row[0] = "ArrayList";
        row[1] = arrayListAddResult;
        row[2] = arrayListDelResult;
        row[3] = arrayListGetResult;
        printTableRow(row, columnWidths);
        System.out.println(horizontalLine);

        row[0] = "LinkedList";
        row[1] = linkedListAddResult;
        row[2] = linkedListDelResult;
        row[3] = linkedListGetResult;
        printTableRow(row, columnWidths);
        System.out.println(horizontalLine);
    }

    private static void printTableRow(String[] row, int[] columnWidths) {
        System.out.printf("| %-" + columnWidths[0] + "s | %-" + columnWidths[1] +
                        "s | %-" + columnWidths[2] + "s | %-" + columnWidths[3] + "s |%n",
                row[0], row[1], row[2], row[3]);
    }

}