package ru.learnup;

public class ArrayTools {
    public static int[] randomValuesArrayGenerator(int arrayLength) {
        int[] arr;
        arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        return arr;
    }

    public static int arrayValuesSummator(int[] array) {
        int sumOfArrayValues = 0;
        for (int a : array) {
            sumOfArrayValues += a;
        }
        return sumOfArrayValues;
    }

    public static String arrayValuesToString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : array) {
            stringBuilder.append(a);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
