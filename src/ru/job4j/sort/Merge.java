package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int countLeft = 0;
        int countRight = 0;

        while (countLeft + countRight < rsl.length) {
            if (countLeft >= left.length) {
                rsl[countRight + countLeft] = right[countRight];
                countRight++;
            } else if (countRight >= right.length) {
                rsl[countRight + countLeft] = left[countLeft];
                countLeft++;
            } else if (left[countLeft] <= right[countRight]) {
                rsl[countLeft + countRight] = left[countLeft];
                countLeft++;
            } else if (right[countRight] < left[countLeft]) {
                rsl[countRight + countLeft] = right[countRight];
                countRight++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
