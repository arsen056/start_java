package com.startjava.lesson_4;

public class ArrayMain {

    public static void main(String[] args) {
       /* Сумма четных положительных элементов массива
        int[] array1 = {3, 4, 8, 5, 2, -2, 2};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if ((array1[i] % 2 == 0) && (array1[i] > 0)) {
                sum+=array1[i];
            }
        }
        System.out.println(sum);
        */

        /* Максимальный из элементов массива с четными индексами
        int[] array2 = {3, 4, 8, 15, 2, -2, 10};
        int max = array2[0];
        for (int i = 2; i < array2.length; i+=2) {
            if (max < array2[i]) {
                max = array2[i];
            }
        }
        System.out.println(max);
        */

        /* Элементы массива, которые меньше среднего арифметического
        double[] array3 = {3, 4, 8, 15, 2};
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
        }
        average = sum/(array3.length);
        for (int j = 0; j < array3.length; j++) {
            if (array3[j] < average) {
                System.out.println(array3[j]);
            }
        }
        */

        /* Сумма модулей элементов массива, расположенных после первого отрицательного
        int[] array4 = {3, -1, -2, 15, -2, -1, 4};
        int neg = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < 0) {
                neg = i;
                break;
            }
        }
        int sum = 0;
        neg+=1;
        for (int j = neg; j < array4.length; j++) {
            if (array4[j] < 0){
                array4[j] *= -1;
            }
            sum += array4[j];
        }
        System.out.println(sum);
        */

        /*Номер минимального по модулю элемента массива
        int[] array5 = {3, 1, 9, 5, -1, 9, 5};
        int min = array5[0];
        int index = 1;
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] < 0) {
                array5[i] *= -1;
            }
            if (array5[i] < min) {
                min = array5[i];
                index = i+1;
            }
        }
        System.out.println(index);
        */

        /* Сумма цифр массива
        int[] array6 = {12, 3, 29, 5};
        int first = 0;
        int second = 0;
        int sum = 0;
        for (int i = 0; i < array6.length; i++) {
            first = array6[i] / 10;
            second = array6[i] % 10;
            sum += (first + second);
        }
        System.out.println(sum);
        */

        /* Найти сумму элементов между минимальным и максимальным элементами массива
        int[] array7 = {1, 3, 4, 8, 15};
        int min = array7[0];
        int minIndex = 0;
        int maxIndex = 0;
        int max = array7[0];
        for (int i = 1; i < array7.length; i++) {
            if (array7[i] < min) {
                min = array7[i];
                minIndex = i;
            }
            if (array7[i] > max) {
                max = array7[i];
                maxIndex = i;
            }
        }
        int tmp = 0;
        if (minIndex > maxIndex) {
            maxIndex = tmp;
            maxIndex = minIndex;
            minIndex = tmp;
        }
        int sum = 0;
        for (int j = minIndex + 1; j < array7.length - 1; j++) {
            sum += array7[j];
        }
        System.out.println(sum);
        System.out.println(min +" " + max);
        */
    }
}
