package Main;

public class Main {
    public static void main(String[] args) {

    int x = 2;
    int y = 18;
    int z = 7; // (задание 1)

        int srednArif = ((x+y+z)/3); // получаем среднее арифметическое (задание 2)

        int zad3 = srednArif/2; // (задание 3)
        if (zad3 > 3) {
            System.out.println("Программа выполнена корректно"); // (задание 4)
        } else {
            System.out.println("Программа выполнена НЕкорректно");
        }
    }
}