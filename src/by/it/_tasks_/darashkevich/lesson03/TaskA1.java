package by.it._tasks_.darashkevich.lesson03;

/*
Lesson 03. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.
5. Программа должна выводить double сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:a");
        System.out.println("Enter any number:b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int m = a-b;
        int p = a*b;
        int d = a/b;
        int mod = a%b;
        double s = (double) a+b;
        double i = (double)a-b;
        double j = (double)a*b;
        double di = (double)a/b;
        double mo = (double)a%b;
        System.out.println(sum+" "+m+" "+p+" "+d+" "+mod );
        System.out.println(s+" "+i+" "+j+" "+di+" "+mo );


    }

}
