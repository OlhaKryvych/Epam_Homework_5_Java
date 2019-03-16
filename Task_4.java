package com.epam.lesson5;

import java.util.Scanner;

public class Task_4 {
    static int posIndex = 0;
    static int negIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please the size of elements: ");
        int size = sc.nextInt();
        int[] array = getRandomArray(size);
        System.out.println("\nA random array: ");
        printArray(array);
        int[] posArray = getPositiveElements(array);
        System.out.println("Positive array: ");
        printArray(posArray);
        int[] negArray = getNegativeElements(array);
        System.out.println("Negative array: ");
        printArray(negArray);
    }

    public static int[] getRandomArray(int size){
        if(size < 1){
            return null;
        }
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(9 * Math.random());
            if(Math.random() < 0.5){
                array[i] = - array[i];
            }
        }
        return array;
    }

    public static int[] getPositiveElements(int[] array) {
        int posNum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                posNum +=1;
            }
        }
        int[] posArray = new int[posNum];
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                posArray[posIndex] = array[i];
                posIndex++;
            }
        }
        return posArray;
    }

    public static int[] getNegativeElements(int[] array) {
        int negNum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
               negNum +=1;
            }
        }
        int[] negArray = new int[negNum];
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                negArray[negIndex] = array[i];
                negIndex++;
            }
        }
        return negArray;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}