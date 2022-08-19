package lesson7;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника — " + fullName + ".");

    }

    public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase() + ".");
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + replaceFullName + ".");
    }

    public static void task4() {

    /*К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
    с Ф. И. О. на три — на фамилию, имя и отчество. В качестве исходных данных используйте:
    Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”; строка fullName — для хранения Ф. И. О. сотрудника в формате
    фамилия - имя - отчество;
    переменная firstName — для хранения имени;
    переменная middleName — для хранения отчества;
    переменная lastName — для хранения фамилии.
    Решите задание с помощью метода substring().
    Результат программы выведите в формате:
    “Имя сотрудника — …”
    “Фамилия сотрудника — …”
    “Отчество сотрудника — ...”*/

        String fullName = "Ivanov Ivan Ivanovich";

        //Через .split()
//         String[] words = fullName.split(" ");
//        System.out.println("Фамилия сотрудника — " + words[0]);
//        System.out.println("Имя сотрудника — " + words[1]);
//        System.out.println("Отчество сотрудника — " + words[2]);
        
        int last = fullName.lastIndexOf(" ");
        int first = fullName.indexOf(" ");
        String middleName = fullName.substring(last);
        String firstName = fullName.substring(first + 1, last);
        String lastName = fullName.substring(0, first);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task5() {

    /*Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
    Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в
    правильный формат. В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
    которые нужно преобразовать в “Ivanov Ivan Ivanovich”. Выведите результат программы в консоль в формате:
    “Верное написание Ф. И. О. сотрудника с заглавных букв — …” */

        String fullName = "ivanov ivan ivanovich";
        String[] words = fullName.split(" ");
        StringBuilder capitalizeWord = new StringBuilder();
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String afterFirst = word.substring(1);
            capitalizeWord.append(firstLetter).append(afterFirst).append(" ");
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + capitalizeWord);
    }

    public static void task6() {

    /*Имеется две строки.
    Первая: "135"
    Вторая: "246"
    Соберите из двух строк одну, содержащую данные "123456".
    Использовать сортировку нельзя.
    Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
    Выведите результат в консоль в формате: “Данные строки — ….”*/

        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        String result = sb.toString();
        System.out.println(result);
    }

    public static void task7() {

    /*Дана строка из букв английского алфавита "aabccddefgghiijjkk".
    Нужно найти и напечатать буквы, которые дублируются в строке.
    Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
    В итоге в консоль должен быть выведен результат программы: "acdgijk".*/

        String s = "aabccddefgghiijjkk";
        char prevChar = Character.MAX_VALUE;
        boolean isDuplicateFound = false;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char letter : chars) {
            if (letter != prevChar) {
                isDuplicateFound = false;
            } else if (isDuplicateFound) {
                continue;
            } else {
                sb.append(letter);
                isDuplicateFound = true;
            }
            prevChar = letter;
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
