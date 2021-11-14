package ru.learnup;

import static ru.learnup.ArrayTools.*;
import static ru.learnup.ParityChecker.parityChecker;

public class Main {
    private static int ARRAY_LENGTH = 20;

    public static void main(String[] args) {
        int[] array = randomValuesArrayGenerator(ARRAY_LENGTH);
        int sum = arrayValuesSummator(array);
        String parityString = parityChecker(sum);

        System.out.println("Элементы массива: " + arrayValuesToString(array));
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Значение суммы элементов массива: " + parityString);
    }
}
