package lesson4;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task11_2();
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
//        task17();
    }


    public static void task1() {
        int i = 0;
        while (i < 10) {
            System.out.printf("%d ", ++i);
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
    }

    public static void task2() {
        for (int friday = 5; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int firstYear = 1822;
        int lastYear = 2122;
        int gap = 79;
        for (int cometFlyingYear = firstYear; cometFlyingYear < lastYear; cometFlyingYear++) {
            if (cometFlyingYear % gap == 0) {
                System.out.println(cometFlyingYear);
            }
        }
    }

    public static void task4() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }
        }
    }

    public static void task5() {
        int num1 = 0;
        int num2 = 1;
        int numFibonacci;
        int numbers = 10;
        System.out.print(num1 + " " + num2 + " ");
        for (int j = 2; j < numbers; j++) {
            numFibonacci = num1 + num2;
            System.out.printf("%d ", numFibonacci);
            num1 = num2;
            num2 = numFibonacci;
        }
    }

    public static void task6() {
        int num = 1000;
        int div = 4;
        int iter = 5;
        while (iter > 0) {
            if (num % div == 0) {
                System.out.println(num);
                iter--;
            }
            num--;
        }
    }

    public static void task7() {
        int i = 1;
        int iter = 10;
//        do {
//            System.out.print(i + " ");
//            i += 2;
//            iter--;
//        } while (iter > 0);
        while (iter > 0) {
            System.out.print(i + " ");
            i += 2;
            iter--;
        }
    }

    public static void task8() {
//        int num = 90;
//        int step = 5;
//        while (num >= 0) {
//            System.out.print(num + " ");
//            num -= step;
//        }
        for (int num = 90; num >= 0; num -= 5) {
            System.out.print(num + " ");
        }
    }

    public static void task9() {
        int num = 4;
        int iter = 10;
        int step = 2;
//        while (iter > 0) {
//            System.out.print(num + " ");
//            num *= step;
//            iter--;
//        }
        for (int i = 0; i < iter; i++) {
            System.out.print(num + " ");
            num *= step;
        }
    }

    public static void task10() {
        int dataSaturday = 1;
        int dataSunday = 2;
        int step = 7;
        int monthDays = 31;
        for (int i = 1; i <= monthDays; i += step) {
            if (dataSaturday <= monthDays) {
                System.out.print(dataSaturday + " ");
            }
            if (dataSunday <= monthDays) {
                System.out.print(dataSunday + " ");
            }
            dataSaturday += step;
            dataSunday += step;
        }
    }

    public static void task11() {
        int count = 0;
        for (int i = 1001; i <= 999999; i++) {
            int n1 = i % 10;
            int n2 = i % 100 / 10;
            int n3 = i % 1_000 / 100;
            int n4 = i % 10_000 / 1_000;
            int n5 = i % 100_000 / 10_000;
            int n6 = i / 100_000;
            boolean luck = n1 + n2 + n3 == n4 + n5 + n6;
            if (luck) {
//                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("Количество счастливых билетов " + count);
    }

    private static void task11_2() {
        int result = 0;
        int first = 1;
        int last = 999_999;
        for (int current = first; current <= last; current++) {
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static int calculateSumOfDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }

    public static void task12() {
        /* В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.*/
        int population = 10_000_000;
        int fertility = 14;
        int mortality = 8;
        int populationIncrease = fertility - mortality;
        for (int year = 1; year <= 10; year++) {
            population += population / 1000 * populationIncrease;
            System.out.println(population);
        }
        System.out.println("Численность населения через 10 лет составит - " + population);
    }

    public static void task13() {
        /* В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
        Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год. Рассчитайте, какая численность населения будет через 10 лет,
        учитывая, что рождаемость не может быть меньше 7 человек на 1000 человек, а смертность не может быть меньше 6 человек на 1000 человек.*/
        int population = 10_000_000;
        int fertility = 14;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
//            if (fertility < 7) {
//                fertility = 7;
//            }
//            if (mortality < 6) {
//                mortality = 6;
//            }
            int populationIncrease = fertility - mortality;
            population += population / 1000 * populationIncrease;
            if (fertility>7) fertility -= 1;
            if (mortality>6) mortality -= 1;
//            fertility--;
//            mortality--;
            System.out.println(population);
        }
        System.out.println("Численность населения через 10 лет составит - " + population);
    }

    public static void task14() {
        /* За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада.");
        float deposit = sc.nextFloat();
        System.out.println("Введите срок вклада в месяцах.");
        int period = sc.nextInt();
        for (int time = 1; time <= period; time++) {
            deposit += deposit * 0.07;
            System.out.println(deposit);
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
        sc.close();
    }

    public static void task15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада.");
        float deposit = sc.nextFloat();
        System.out.println("Введите срок вклада в месяцах.");
        int period = sc.nextInt();
        int time = 1;
        while (time <= period) {
            time++;
            deposit += deposit * 0.07;
            System.out.println(deposit);
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
        sc.close();
    }

    public static void task16() {
        for (int i = 1;i<10;i++ ) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }
    }

    public static void task17() {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("Введите второе число");
            int b = sc.nextInt();
            System.out.printf("%d * %d = %d \n", a, b, a * b);
            System.out.println("Для выхода из программы нажмите цифру 1, для продолжения любую другую цифру");
            i = sc.nextInt();
        }
        while (i != 1);
        sc.close();
    }
}
