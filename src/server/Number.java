package server;

import java.util.Arrays;

public class Number {
    public static int findNumberLost(int... array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Массив не содержит элементов");

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        boolean [] isFound  = new boolean[max - min + 1];

        for (int num : array) {
            isFound[num - min] = true;
        }

        for (int i = 0; i < isFound.length; i++) {
            if (!isFound[i]) {
                return i + min;
            }
        }

        return ++max;
    }
}
