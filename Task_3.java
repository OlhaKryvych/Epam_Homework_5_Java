package com.epam.lesson5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please the size of arrays: ");
        int size = sc.nextInt();
        int[] array1 = getRandomArray(size);
        System.out.println("\nThe 1st random array: ");
        printArray(array1);
        int[] array2 = getRandomArray(size);
        System.out.println("The 2nd random array: ");
        printArray(array2);
        int[] array3 = getThirdArray(array1, array2,size);
        System.out.println("\nThe 3rd array, which elements are the sum of previous arrays: ");
        printArray(array3);
    }

    public static int[] getRandomArray(int size){
        if(size < 1){
            return null;
        }
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(9 * Math.random());
        }
        return array;
    }

    public static int[] getThirdArray(int[] array1, int[] array2, int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = array1[i] + array2[i];
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
