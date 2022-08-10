package lesson5;

import java.util.Arrays;
import java.util.Random;

public class ArraysP1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
//        additionalTask1();
//        additionalTask2();
//        additionalTask3();
//        additionalTask4();
//        additionalTask5();
//        additionalTask6();
    }


    public static void task1() {
        int[] array1 = new int[]{1, 2, 3};

        double[] array2 = new double[]{1.57, 7.654, 9.986};

        String[] array3 = new String[]{"Petya", "Misha", "Kolya"};
    }

    public static void task2() {
        int[] array1 = new int[]{1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
        double[] array2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
        String[] array3 = new String[]{"Petya", "Misha","Misha", "Kolya"};
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static void task3() {
        int[] array1 = new int[]{1, 2, 3};
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
            } else {
                System.out.printf("%d,", array1[i]);
            }
        }
        System.out.println();

        double[] array2 = new double[]{1.57, 7.654, 9.986};
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array2[i]);
            } else {
                System.out.printf("%s,", array2[i]);
            }
        }
        System.out.println();

        String[] array3 = new String[]{"Petya", "Misha", "Kolya"};
        for (int s = array3.length - 1; s >= 0; s--) {
            if (s == 0) {
                System.out.print(array3[s]);
            } else {
                System.out.printf("%s,", array3[s]);
            }
        }
    }

    public static void task4() {
        int[] array = new int[]{1, 2, 3, 5, 7};
        int add = 1;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] % 2 == 0)) {
                array[i] += add;
            }
            System.out.printf("%d ", array[i]);
        }
    }

    public static int[] generateRandomArray(int min, int max, int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void additionalTask1() {
        int[] array = generateRandomArray(0, 99, 15);
        System.out.println(Arrays.toString(array));
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                even++;
            }
        }
        System.out.print("\n" + "Количество четных элементов в массиве: " + even);
    }

    public static void additionalTask2() {
        int[] array = generateRandomArray(1, 10, 8);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array));
    }


    public static void  additionalTask3() {
        int arraySize = 5;
        int[] array1 = generateRandomArray(0, 5, arraySize);
        int[] array2 = generateRandomArray(0, 5, arraySize);
        System.out.println("Первый массив - " + Arrays.toString(array1));
        System.out.println("Второй массив - " + Arrays.toString(array2));
        int array1Sum = 0;
        int array2Sum = 0;
        for (int i = 0;i< arraySize;i++) {
            array1Sum += array1[i];
            array2Sum += array2[i];
        }
        float array1Average = array1Sum * 1.0f/ arraySize;
        float array2Average = array2Sum * 1.0f/ arraySize;
        System.out.println(array1Average);
        System.out.println(array2Average);
        if (array1Average > array2Average) {
            System.out.println("Среднее арифметическое больше у первого массива");
        } else if (array1Average < array2Average) {
            System.out.println("Среднее арифметическое больше у второго массива");
        } else {
            System.out.println("Средние арифметические равны");
        }
    }

    public static void additionalTask4() {
        int[] array = generateRandomArray(10, 99, 4);
        System.out.println(Arrays.toString(array));
        boolean arraySequential = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                arraySequential = false;
                break;
            }
        }
        if (arraySequential) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    public static void additionalTask5() {
        int[] arrayFibonacci = new int[20];
        arrayFibonacci[1] = 1;
        for (int i = 2; i < arrayFibonacci.length; i++) {
            arrayFibonacci[i] = arrayFibonacci[i - 2] + arrayFibonacci[i - 1];
        }
        System.out.println(Arrays.toString(arrayFibonacci));
    }

    public static void additionalTask6() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            array[i] *= array[i];
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            if (i % 2 != 0) {
                array2[i] *= -array2[i];
            } else {
                array2[i] *= array2[i];
            }
        }
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[10];
        Arrays.fill(array3, 1);
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 != 0) {
                array3[i] *= -array3[i];
            } else {
                array3[i] *= array3[i];
            }
        }
        System.out.println(Arrays.toString(array3));

        int[] array4 = new int[10];
        array4[0] = 1;
        for (int i = 2; i < array4.length; i++) {
            if (i % 2 == 0) {
                array4[i] = array4[i-2] + 1;
            }
        }
        System.out.println(Arrays.toString(array4));
    }
}
