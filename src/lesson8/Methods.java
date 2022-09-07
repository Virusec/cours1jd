package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");        }
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        sc.close();
        isLeap(year);
    }

    public static void printRecommendationSystem( int type, int year) {
        if (type == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (type == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (type == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.print("Система не распознана");
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите операционную систему. 0 - для iOS. 1 - для Android");
        int clientOS = sc.nextInt();
        System.out.println("Укажите год производства телефона");
        int clientDeviceYear = sc.nextInt();
        sc.close();
        printRecommendationSystem(clientOS, clientDeviceYear);
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance >= 20) {
            deliveryDays++;
        }
        if (distance >= 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = sc.nextInt();
        sc.close();
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    public static void reverseArray(char[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            char temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }

    public static void task4() {

    /*Напишите метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
    В метод приходит массив, допустим:
    {3, 2, 1, 6, 5}.
    Нужно без вспомогательного массива переместить элементы так, чтобы поданный массив стал: {5, 6, 1, 2, 3}.
    Рекомендуем написать этот метод без возвращаемого значения. Вы будете приятно удивлены, что даже если мы не вернем
    массив, первоначальный массив изменится, когда мы будем модернизировать пришедший в виде параметра массив внутри
    метода.*/

        char[] text = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseArray(text);
        System.out.println("Измененный массив" + Arrays.toString(text));
    }

    public static void findDuplicate(String string) {
        char prevChar = Character.MAX_VALUE;
        char[] chars = string.toCharArray();
        for (char letter : chars) {
            if (letter == prevChar) {
                System.out.println("Найден дубль, символ : " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("Дублей нет");
    }

    public static void task5() {

        /*Напишите метод, который в виде параметра принимает отсортированную строку.
    Например, aabccddefgghiijjkk.
    С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль сообщение об этом.
    Если дубль найден, нужно прервать поиск по остальным символам и вывести сообщение о присутствии дубля, причем с
    указанием, какой именно символ задублирован. Затем сразу же прервать выполнение метода.
    Сам метод ничего возвращать не должен (void).*/

        String s = "aabccddefgghiijjkk";
        findDuplicate(s);
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double calculateAverageValue(int[] array) {
        int sum = calculateSum(array);
        return calculateAverage(sum, array.length);
    }

    private static double calculateAverage(int sum, int sumOfElements) {
        return sum / (double) sumOfElements;
    }

    public static void task6() {

        /*Нужно сгенерировать массив, подать его в наш метод, а внутри метода подсчитать сумму элементов и вычислить
        среднее значение, которое нужно вернуть из метода в виде результата.
        Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
        То есть для работы этого метода нужно будет создать еще методы (1 или более), которые его будут обслуживать
        и вычислять промежуточные результаты. Среднее значение нужно вычислять в дробном виде, так как результат должен
        быть точным.*/

        int[] array = generateRandomArray();
        System.out.println("Средняя сумма трат за месяц составила " + calculateAverageValue(array) + " рублей");
    }
}
