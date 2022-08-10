package lesson2;

import java.util.Scanner;

public class Variables {
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
        task10();
        task11();
    }

    public static void task1() {
        byte a = -5;
        short b = 12;
        int c = 123456;
        long d = 1234567890L;
        float e = 1.1234f;
        double f = 12.123456789;
        char g = 11;
        boolean h = b > 18;
    }

    public static void task2() {
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float sum = boxer1 + boxer2;
        float diff = boxer2 - boxer1;
        System.out.println("Вес двух бойцов: " + sum);
        System.out.println("Разница между весами бойцов.: " + diff);
    }

    public static void task3() {
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int sum = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        float sumKg = (sum * 1.0f / 1000) ;
        System.out.println(sumKg);
    }

    public static void task4() {
        int weight = 7000;
        int loseWeight1 = 500;
        int loseWeight2 = 250;
        int days1 = weight / loseWeight1;
        int days2 = weight / loseWeight2;
        System.out.println(days1);
        System.out.println(days2);
    }

    public static void task5() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int oldSalaryMasha = salaryMasha * 12;
        int oldSalaryDenis = salaryDenis * 12;
        int oldSalaryKris = salaryKris * 12;
        float newSalaryMasha = oldSalaryMasha * 0.1f;
        float newSalaryDenis = oldSalaryDenis * 0.1f;
        float newSalaryKris = oldSalaryKris * 0.1f;
        float diffMasha = newSalaryMasha * 12 - oldSalaryMasha;
        float diffDenis = newSalaryDenis * 12 - oldSalaryDenis;
        float diffKris = newSalaryKris * 12 - oldSalaryKris;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Denis теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Kris теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + diffKris + " рублей");
    }

    public static void task6() {
        int a = 47;
        int b = 13;
        int divide = a / b;
        int rest = a % b;
        System.out.println("При делении a/b = " +  divide + " остаток от деления = " + rest);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 10;
        int b = num % 10;
        System.out.println(a + b);
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 100;
        int b = num % 100;
        int c = b / 10;
        int d = b % 10;
        System.out.println(a + c + d);
    }

    public static void task9() {
        int flowers = 4899;
        int postcard = 157;
        int purchaseAmount = flowers + postcard;
        int discount = 10;
        float discountSum = purchaseAmount * (discount / 100f);
        float purchaseAmountWithDiscount = purchaseAmount - discountSum;
        System.out.println("Сумма двух покупок с учетом скидки - " + purchaseAmountWithDiscount);
        System.out.println("Сумма скидки покупки - " + discountSum);
    }

    public static void task10() {
//        А
        int orangeCost = 73;
        int orange = 10;
        int orangeDiscount = 15;
        int bananaCost = 95;
        int banana = 2;
        float orangeTotal = orange * orangeCost - (orange * orangeCost * orangeDiscount / 100f);
        float bananaTotal = banana * bananaCost;
        System.out.println("Стоимость покупки составит " + (orangeTotal + bananaTotal));
//        Б
        int bubblyCost = 2870;
        int bubbly = 10;
        int bubblyDiscount = 50;
        int breadCost = 27;
        int bread = 1;
        float bubblyTotal = bubbly * bubblyCost - (bubbly * bubblyCost * bubblyDiscount / 100f);
        float breadTotal = bread * breadCost;
        System.out.println("Стоимость покупки составит " + (bubblyTotal + breadTotal));
//        В
        int champignonsCost = 436;
        float champignons = 2.5f;
        int whiteMushroomsCost = 578;
        float whiteMushrooms = 3.75f;
        int whiteMushroomsDiscount = 5;
        float champignonsTotal = champignonsCost * champignons;
        float whiteMushroomsTotal = whiteMushrooms * whiteMushroomsCost - (whiteMushrooms * whiteMushroomsCost * whiteMushroomsDiscount / 100f);
        System.out.println("Стоимость покупки составит " + (champignonsTotal + whiteMushroomsTotal));
    }

    public static void task11() {
        double x = 0.40;
        double y = 0.87;
        double solve1 = 11 * x + y;
        double solve2 = (x + 10 * y) - 15 * (x / y);
        System.out.println(solve1);
        System.out.println(solve2);
    }
}