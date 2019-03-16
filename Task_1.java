package com.epam.lesson5;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please size of array:  ");
        int size = sc.nextInt();
        int[] array = new int[size];
        array = getRandomArray(size, array);
        printArray(array);
        array = getReverseArray(array, size);
        printArray(array);
    }

    public static int[] getRandomArray(int size, int[] arr) {
        if(size < 1){
            return null;
        }
        for(int i = 0; i < size; i++){
            arr[i] = (int)(8 * Math.random());
        }
        return arr;
    }

    public static int[] getReverseArray(int[] array, int size){
        for (int i = 0, j = size - 1; i < j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}