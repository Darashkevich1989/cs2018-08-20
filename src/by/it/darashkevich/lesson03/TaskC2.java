package by.it._tasks_.darashkevich.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {




    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
    int C = sc.nextInt();
        System.out.println(sumDigitsInNumber(C));

    }
    static int sumDigitsInNumber(int C){
        String s = Integer.toString(C);
        char [] arr = s.toCharArray();
        int result = Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[1]) + Character.getNumericValue(arr[2])+ Character.getNumericValue(arr[3]);
        return result;}



}
