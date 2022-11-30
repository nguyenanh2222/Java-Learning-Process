package org.example;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int arr[], int left, int right) {
        if(left >= right) return;
        int key = arr[(left + right) / 2];
        int k = partition(arr, left, right, key);
        quickSort(arr, left, k-1);
        quickSort(arr, k, right);

    }
    static void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static int partition(int[] arr, int left, int right, int key) {
        int iL = left;
        int iR = right;

        while (iL <= iR) {
            while (arr[iL] < key) iL++;
            while (arr[iR] > key) iR--;
            if (iL <= iR) {
            swap(arr, iL, iR);
            iL++;
            iR--;
    }
}
        return iL;
    }

    public void display(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 0,0, 2, 8, 1, 3, 9, 0,4, 5 };

        QuickSort sapXepNhanh = new QuickSort();
        System.out.println("input: ");
        sapXepNhanh.display(arr);
        System.out.println("-----------------------------");
        sapXepNhanh.quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\noutput: ");
        sapXepNhanh.display(arr);}
}
