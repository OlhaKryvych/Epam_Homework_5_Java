package com.epam.lesson5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please the size of array:  ");
        int size = sc.nextInt();
        int[] array = getRandomArray(size);
        printArray(array);
        System.out.println("The amount of odd elements:  " + countOddElem(array));
        System.out.println("The sum of odd elements:  " + getSumOddElem(array));
    }

    public static int[] getRandomArray(int size){
        int[] array = new int[size];
        if (size < 1){
            return null;
        }
        for(int i = 0; i < size; i++){
            array[i] = (int)(9 * Math.random());
        }
        return array;
    }

    public  static Integer countOddElem(int[] array){
        int count = 0;
        for (int elem:array) {
            if(elem % 2 != 0){
                count += 1;
            }
        }
        return count;
    }

    public static Integer getSumOddElem(int[] array){
        int sum = 0;
        for (int elem:array) {
            if(elem % 2 != 0){
                sum += elem;
            }
        }
        return sum;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }
}