package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int leftTwo) {
        return max(max(left, right), leftTwo);
    }

    public static int max(int left, int right, int leftTwo, int rightTwo) {
        return max(max(left, right), max(leftTwo, rightTwo));
    }
}
