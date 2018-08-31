package by.it._tasks_.darashkevich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:n1");
        System.out.println("Enter any number:n2");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        String s = "Sum";
        int result =n1+n2;
        System.out.print(s);
        System.out.print(" ");
        System.out.print("=");
        System.out.print(" ");
        System.out.println(result);
    }




}
