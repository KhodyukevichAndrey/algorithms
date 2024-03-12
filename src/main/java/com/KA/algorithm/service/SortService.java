package com.KA.algorithm.service;

import org.springframework.stereotype.Service;

@Service
public class SortService {
    public void bubbleSort() {
        int[] array = new int[]{42, 24, 35, 57, 45, 43, 75, 102};

        printer(array);

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        printer(array);
    }

    public void chosenSort() {
        int[] array = new int[]{42, 24, 35, 57, 45, 43, 75, 102};

        printer(array);

        for (int step = 0; step < array.length; step++) {
            int index = getMin(array, step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }

        printer(array);
    }

    public void quickSort() {
        int[] array = new int[]{42, 24, 35, 57, 45, 43, 75, 102};
        printer(array);

        makeQuick(array, 0, array.length - 1);

        printer(array);
    }
    private int getMin(int[] array, int start) { //chosen start sort
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void makeQuick(int[] array, int from, int to) {
        if (from < to) {
            int divideIndex = partition(array, from, to);
            makeQuick(array, from, divideIndex - 1);
            makeQuick(array, divideIndex, to);
        }
    }

    private int partition(int[] array, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = array[from];

        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private void swap (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void printer (int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
}
