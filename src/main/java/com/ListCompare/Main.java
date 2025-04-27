package com.ListCompare;

public class Main {
    public static void main(String[] args) {
        ListComparer listComparer = new ListComparer();
        printCompareTable(listComparer.addCompare(1000000));
    }
    public static void printCompareTable(Pair<Long, Long> addCompareResult) {
        String arrayListAddResult = Double.toString(addCompareResult.firstValue()/1000000.0);
        String linkedListAddResult = Double.toString(addCompareResult.secondValue()/1000000.0);
        int addStringLength = Math.max(arrayListAddResult.length(), linkedListAddResult.length());
        addStringLength = Math.max(addStringLength, 3);
        int[] columnWidths = {
                10,
                addStringLength,
        };

        String horizontalLine = "+" + "-".repeat(columnWidths[0] + 2)
                + "+" + "-".repeat(columnWidths[1] + 2) + "+";

        String[] row= new String[2];
        System.out.println(horizontalLine);
        row[0] = "";
        row[1] = "Add";
        printTableRow(row, columnWidths);

        System.out.println(horizontalLine);
        row[0] = "ArrayList";
        row[1] = arrayListAddResult;
        printTableRow(row, columnWidths);
        System.out.println(horizontalLine);

        row[0] = "LinkedList";
        row[1] = linkedListAddResult;
        printTableRow(row, columnWidths);
        System.out.println(horizontalLine);
    }
    private static void printTableRow(String[] row, int[] columnWidths) {
        System.out.printf("| %-" + columnWidths[0] + "s | %-" + columnWidths[1] + "s |%n",
                row[0], row[1]);
    }

}