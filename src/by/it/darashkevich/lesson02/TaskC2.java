package by.it._tasks_.darashkevich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:n1");
        System.out.println("Enter any number:n2");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        int result = n1 + n2;
        Integer.toBinaryString(n1);
        Integer.toBinaryString(n2);
        Integer.toOctalString(n1);
        Integer.toOctalString(n2);
        Integer.toHexString(n1);
        Integer.toHexString(n2);
        String s = "DEC";
        System.out.print(s);
        System.out.print(":");
        System.out.print(n1);
        System.out.print("+");
        System.out.print(n2);
        System.out.print("=");
        System.out.println(result);
        System.out.print("BIN");
        System.out.print(":");
        System.out.print(Integer.toBinaryString(n1));
        System.out.print("+");
        System.out.print(Integer.toBinaryString(n2));
        System.out.print("=");
        System.out.println(Integer.toBinaryString(n1 + n2));
        System.out.print("HEX");
        System.out.print(":");
        System.out.print(Integer.toHexString(n1));
        System.out.print("+");
        System.out.print(Integer.toHexString(n2));
        System.out.print("=");
        System.out.println(Integer.toHexString(n1 + n2));
        System.out.print("OCT");
        System.out.print(":");
        System.out.print(Integer.toOctalString(n1));
        System.out.print("+");
        System.out.print(Integer.toOctalString(n2));
        System.out.print("=");
        System.out.println(Integer.toOctalString(n1 + n2));
    }


}
