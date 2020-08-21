package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, (data.length - 1));
            int index = FindLoop.indexOf(data, min, i, (data.length - 1));
            //swap(...)
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;

//            SortSelected srtSel = new SortSelected();
//            srtSel.swap(data, index, i);
        }
        return data;
    }

//    public int[] swap(int[] data, int index, int i) {
//        int temp = data[i];
//        data[i] = data[index];
//        data[index] = temp;
//        return data;
//    }
}