package lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArraysP2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
//        additionalTask1();
//        additionalTask2();
//        additionalTask3();
//        additionalTask4();
//        additionalTask5();
//        additionalTask6();
    }


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

//        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//        в формате: «Сумма трат за месяц составила … рублей».

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {

        /*Найти минимальную и максимальную трату за день. Нужно написать программу, которая решит эту задачу, и вывести
        в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за
        день составила … рублей».*/

        int[] arr2 = generateRandomArray();
        System.out.println(Arrays.toString(arr2));

//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("Максимальная сумма трат за день составила " + arr2[arr2.length-1] + " рублей");
//        System.out.println("Минимальная сумма трат за день составила " + arr2[0] + " рублей");

        int max = arr2[0];
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            int value = arr2[i];
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }

    public static void task3() {

        /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».*/

        int[] arr3 = generateRandomArray();
        int sum = 0;
        for (int i : arr3) {
            sum += i;
        }
        float average = sum / (float) arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {

        /*Данные с именами сотрудников хранятся в виде массива символов (char[]).Напишите код, который в случае такого
        бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".*/

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {

//        Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее
//        в консоль. Постарайтесь заполнить обе диагонали в одном цикле.

        int[][] matrix = new int[3][3];
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = value;
            matrix[i][matrix.length - 1 - i] = value;
        }
        for (int[] row :
                matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void task6() {

//        У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
//        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
//        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
//        Нам дан массив чисел: {5, 4, 3, 2, 1}
//        Необходимо привести его к виду: {1, 2, 3, 4, 5}
//        Решите задачу с использованием дополнительного массива.

        int[] arr4 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            arr5[i] = arr4[arr4.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr5));
    }

    public static void task7() {

//      Решите предыдущее задание, но без использования дополнительного массива.
//      Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
//      Выведите результат программы в консоль тем же способом.

        int[] arr6 = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr6));
        //Решение через for:
//        for (int i = 0; i < arr6.length/2; i++) {
//            int temp = arr6[i];
//            arr6[i] = arr6[arr6.length - 1 - i];
//            arr6[arr6.length - 1 - i] = temp;
//        }
        //Решение через while:
        int head = 0;
        int tail = arr6.length - 1;
        while (head < tail) {
            int temp = arr6[head];
            arr6[head++] = arr6[tail];
            arr6[tail--] = temp;
        }
        System.out.println(Arrays.toString(arr6));
    }

    public static void task8() {

//         Необходимо найти два числа, сумма которых равна −2. Напечатать эти числа в консоль.

        int[] arr7 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr7));
        //Решение через for:
//        int sum = -2;
//        boolean isFinished = false;
//        for (int i = 0; i < arr7.length; i++) {
//            int first = arr7[i];
//            if (isFinished) {
//                break;
//            }
//            for (int j = i + 1; j < arr7.length; j++) {
//                int second = arr7[j];
//                if (first + second == sum) {
//                    System.out.println(first + " " + second);
//                    isFinished = true;
//                }
//            }
//        }
        //Решение через while:
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        int currentSum = -2;
        int head = 0;
        int tail = arr7.length - 1;
        while (head < tail) {
            int sum = arr7[head] + arr7[tail];
            if (sum == currentSum) {
                System.out.println(arr7[head] + " " + arr7[tail]);
                break;
            } else if (sum > currentSum) {
                tail--;
            } else {
                head++;
            }
        }
    }

    public static void task9() {

//        Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.

        int[] arr8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr8));
//        Решение через for:
//        int sum = -2;
//        for (int i = 0; i < arr8.length; i++) {
//            int first = arr8[i];
//            for (int j = i + 1; j < arr8.length; j++) {
//                int second = arr8[j];
//                if (first + second == sum) {
//                    System.out.println(first + " " + second);
//                }
//            }
//        }
        //Решение через while:
        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));
        int currentSum = -2;
        int head = 0;
        int tail = arr8.length - 1;
        while (head < tail) {
            int sum = arr8[head] + arr8[tail];
            if (sum == currentSum) {
                System.out.println(arr8[head++] + " " + arr8[tail--]);
            } else if (sum > currentSum) {
                tail--;
            } else {
                head++;
            }
        }
    }


    public static int[] generateRandomArray2(int min, int max, int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void additionalTask1() {

//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения
//        в массив.

        int[] array = generateRandomArray2(-15, 15, 12);
        System.out.println(Arrays.toString(array));
        int maxElement = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }
        System.out.printf("Максимальный элемент %d под индексом %d", maxElement, maxIndex);
    }

    public static void additionalTask2() {

//        Напишите программу, которая определяет, какой элемент встречается в массиве чаще всего.
//        Выведите данную информацию в консоль. Если два разных элемента встречаются одинаковое количество
//        раз, то выведите -1.

        int[] array2 = generateRandomArray2(0, 1, 12);
        System.out.println(Arrays.toString(array2));
        int num = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                num++;
            }
        }
        System.out.println(num);
        if (num > array2.length - num) {
            System.out.println("0");
        } else if (num < array2.length - num) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }

    public static int[][] generateRandomArray3(int min, int max, int s1, int s2) {
        Random random = new Random();
        int[][] array = new int[s1][s2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return array;
    }

    public static void additionalTask3() {

//        Напишите программу, которая генерирует двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых
//        чисел из отрезка [10;99]. Результат программы выведите в консоль.

        int lines = 8;
        int columns = 5;

        int[][] array3 = generateRandomArray3(10, 99, lines, columns);
        for (int[] l : array3) {
            for (int c : l) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

//        int[][] matrix = new int[lines][];
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = generateRandomArray2(10, 99, columns);
//        }
//        for (int[] subArr : matrix) {
//            System.out.println(Arrays.toString(subArr));
//        }
    }

    public static void additionalTask4() {

//        Напишите программу, которая генерирует двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых
//        чисел из отрезка [-99;99]. Результат программы выведите в консоль. Отдельно выведите значение максимального
//        элемента этого массива.

        int lines = 5;
        int columns = 8;

        int[][] array4 = generateRandomArray3(10, 99, lines, columns);
        int maxNum = array4[0][0];
        for (int[] matrix : array4) {
            for (int sub : matrix) {
                System.out.print(sub + " ");
                if (sub > maxNum) {
                    maxNum = sub;
                }
            }
            System.out.println();
        }
        System.out.println("\nМаксимальный элемент массива " + maxNum);


//        int[][] matrix = new int[5][];
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = generateRandomArray2(10, 99, 8);
//        }
//
//        int max = matrix[0][0];
//        for (int[] subArr : matrix) {
//            for (int num : subArr) {
//                max = Math.max(max, num);
//            }
//            System.out.println(Arrays.toString(subArr));
//        }
//
//        System.out.println("Максимальный элемент: " + max);
    }

    public static void additionalTask5() {

//        Напишите программу, которая генерирует массив из 7 строк по 4 столбца в каждой из случайных целых чисел
//        из отрезка [-5;5]. Результат программы выведите в консоль. Отдельно выведите индекс строки с наибольшим
//        произведением элементов.

        int lines = 7;
        int columns = 4;

        int[][] array5 = generateRandomArray3(-5, 5, lines, columns);
        int[] array6 = new int[lines];
        for (int i = 0; i < array5.length; i++) {
            int multiply = 1;
            for (int j = 0; j < array5[i].length; j++) {
                multiply *= array5[i][j];
                array6[i] = multiply;
            }
            System.out.println(Arrays.toString(array5[i]));
        }
//        System.out.println(Arrays.toString(array6));
        int maxNum = 0;
        int maxIndex = array6[0];
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > maxNum) {
                maxNum = array6[i];
                maxIndex = i;
            }
        }
        System.out.printf("\nМаксимальное произведение в строке %d.\n", maxIndex);


//        int[][] matrix = new int[7][];
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = generateRandomArray2(1, 5, 4);
//        }
//
//        int maxProduct = Integer.MIN_VALUE;
//        int maxProductIndex = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            int tmp = 1;
//            for (int num : matrix[i]) {
//                tmp *= num;
//            }
//            if (tmp > maxProduct) {
//                maxProduct = tmp;
//                maxProductIndex = i;
//            }
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        System.out.println();
//
//        System.out.println("Максимальное произведение в строке № " + maxProductIndex);
    }

    public static void additionalTask6() {

//        Напишите программу, которая генерирует двумерный массив из 6 строк по 7 столбцов в каждой.
//        Массив должен состоять из случайных целых чисел из промежутка [0;9].Результат программы выведите в консоль.
//        Преобразуйте массив таким образом, чтобы на первом месте (индекс 0) в каждой строке стоял самое большое число
//        в строке. Состав массива изменять нельзя, но можно переставлять элементы в рамках одной строки. Порядок
//        остальных элементов строки не важен. Результат преобразований выведите в консоль.

        int lines = 6;
        int columns = 7;

        int[][] array7 = generateRandomArray3(0, 9, lines, columns);
        for (int[] line : array7) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println();

        for (int[] row : array7) {
            int temp = row[0];
            int index = 0;
            for (int j = 1; j < row.length; j++) {
                if (row[j] > row[0]) {
                    row[0] = row[j];
                    index = j;
                }
            }
            row[index] = temp;
            System.out.println(Arrays.toString(row));
        }


//        int[][] matrix = new int[6][];
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = generateRandomArray2(0, 9, 7);
//        }
//
//        for (int[] subArr : matrix) {
//            System.out.println(Arrays.toString(subArr));
//        }
//
//        for (int[] subArr : matrix) {
//            int maxElement = subArr[0];
//            int maxElementIndex = 0;
//            for (int i = 1; i < subArr.length; i++) {
//                if (subArr[i] > maxElement) {
//                    maxElement = subArr[i];
//                    maxElementIndex = i;
//                }
//            }
//            if (maxElementIndex > 0) {
//                int tmp = subArr[0];
//                subArr[0] = maxElement;
//                subArr[maxElementIndex] = tmp;
//            }
//        }
//        System.out.println("После преобразований:");
//        for (int[] subArr : matrix) {
//            System.out.println(Arrays.toString(subArr));
//        }
    }
}