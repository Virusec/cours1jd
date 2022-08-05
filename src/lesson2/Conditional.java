package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
//        task1();
        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task1_1();
//        task1_2();
//        task1_3();
//        task1_4();
//        task1_5();
//        task1_6();
//        taskSlack6();
//        taskSlack7();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите операционную систему. 0 - для iOS. 1 - для Android");
        int clientOS = sc.nextInt();
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Система не распознана");
        }
        sc.close();
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите операционную систему. 0 - для iOS. 1 - для Android");
        int clientOS = sc.nextInt();
        System.out.println("Укажите год производства телефона");
        int clientDeviceYear = sc.nextInt();
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.print("Система не распознана");
        }
//        if (clientOS == 0) {
//            if (clientDeviceYear < 2015) {
//                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//            } else {
//                System.out.println("Установите версию приложения для iOS по ссылке");
//            }
//        } else if (clientOS == 1) {
//            if (clientDeviceYear < 2015) {
//                System.out.println("Установите облегченную версию приложения для Android по ссылке");
//            } else {
//                System.out.println("Установите версию приложения для Android по ссылке");
//            }
//        } else {
//            System.out.print("Система не распознана");
//        }
        sc.close();
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        sc.close();
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = sc.nextInt();
        int deliveryDays = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        sc.close();
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца.");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
//                For Java 14
//            case 12,1,2 -> System.out.println("Зима");
//            case 3,4,5 -> System.out.println("Весна");
//            case 6,7,8 -> System.out.println("Лето");
//            case 9,10,11 -> System.out.println("Осень");
//            default -> System.out.println("Такого месяца не существует");
        }
        sc.close();
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Оба числа равны: " + a + " = " + b);
        } else if (a > b) {
            System.out.println("Первое число больше второго: " + a + " > " + b);

        } else {
            System.out.println("Первое число меньше второго: " + a + " < " + b);
        }
        sc.close();
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        if (num < 9 && num > 2) {
            System.out.println("Число больше 2 и меньше 9");
        } else {
            System.out.println("Неизвестное число");
        }
        sc.close();
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int depositAmount = sc.nextInt();
        if (depositAmount < 100) {
            double amount1 = depositAmount * 1.05;
            System.out.println(amount1);
        } else if (depositAmount >= 100 && depositAmount <= 200) {
            double amount2 = depositAmount * 1.07;
            System.out.println(amount2);
        } else {
            double amount3 = depositAmount * 1.1;
            System.out.println(amount3);
        }
        sc.close();
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение 4. Деление");
        int operationNum = sc.nextInt();
        switch (operationNum) {
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            case 4:
                System.out.println("Деление");
                break;
            default:
                System.out.println("Операция не определена");
        }
        sc.close();
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        float num1 = sc.nextInt();
        System.out.println("Введите второе число");
        float num2 = sc.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение 4. Деление");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Результат операции: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Результат операции: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Результат операции: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Результат операции: " + (num1 / num2));
                break;
            default:
                System.out.println("Операция не определена");
        }
        sc.close();
    }


    public static void task1_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число p");
        int p = sc.nextInt();
        if (p % 2 == 0 && p != 0) {
            System.out.printf("Число %d является четным", p);
        } else {
            System.out.printf("Число %d является не четным \n", p);
        }
        sc.close();
    }

    public static void task1_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число p");
        double p = sc.nextDouble();
        System.out.println("Введите число d");
        double d = sc.nextDouble();
        double pm = Math.abs(10 - p);
        double dm = Math.abs(10 - d);
        if (dm < pm) {
            System.out.println(d);
        } else {
            System.out.println(p);
        }
        sc.close();
    }

    public static int generateRandomNum(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static void task1_3() {
        int a = generateRandomNum(3, 158);
        if (a > 22 && a < 99) {
            System.out.printf("Число %d находится в интервале (22;99)", a);
        } else {
            System.out.printf("Число %d вне интервала (22;99)", a);
        }
    }

    public static void task1_4() {
        int num = generateRandomNum(100, 999);
        int a = num / 100;
        int b = num % 100 / 10;
        int c = num % 10;
        if (a > b && a > c) {
            System.out.printf("%d - наибольший член числа %d", a, num);
        } else if (b > a && b > c) {
            System.out.printf("%d - наибольший член числа %d", b, num);
        } else System.out.printf("%d - наибольший член числа %d", c, num);
    }

    public static void task1_5() {
        int a = generateRandomNum(-100000, 100000);
        int b = generateRandomNum(-100000, 100000);
        int c = generateRandomNum(-100000, 100000);
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + "," + b + "," + c);
            } else {
                System.out.println(a + "," + c + "," + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + "," + a + "," + c);
            } else {
                System.out.println(b + "," + c + "," + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + "," + a + "," + b);
            } else {
                System.out.println(c + "," + b + "," + a);
            }
        }
    }

    public static void task1_6() {
        int time = generateRandomNum(0, 28800);
        int timeDay = 28800;
        int secondsLeft = timeDay - time;
        float hoursLeft = Math.round(secondsLeft / (60.0f * 60f));
        System.out.println("До конца рабочего дня осталось " + secondsLeft + " секунд");
        System.out.println("До конца рабочего дня осталось " + hoursLeft + " час(а/ов)");
    }

    public static void taskSlack6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        System.out.println("Введите зарплату");
        int salary = sc.nextInt();
        if (age < 23) {
            salary *= 2;
        } else {
            salary *= 3;
        }
        if (salary >= 50000 && salary < 80000) {
            salary *= 1.2;
        } else if (salary >= 80000) {
            salary *= 1.5;
        }
        System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %d рублей", salary);
        sc.close();
    }

    public static void taskSlack7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        System.out.println("Введите зарплату");
        int salary = sc.nextInt();
        System.out.println("Введите желаемую сумму кредита");
        int wantedSum = sc.nextInt();
        int term = 12;
        double creditRate = 10;
        if (age < 23) {
            creditRate += 1;
        } else if (age < 30) {
            creditRate += 0.5;
        }
        if (salary > 80000) {
            creditRate -= 0.7;
        }
        double maxPayment = salary / 2;
        double currentPayment = (wantedSum * ((creditRate / 100) + 1) / term);
        if (currentPayment < maxPayment) {
            System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. Одобрено",salary,maxPayment,currentPayment);
        } else {
            System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. Отказано",salary,maxPayment,currentPayment);
        }
    }
}
