package by.it._tasks_.darashkevich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
    int num[] = new int [20];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < num.length; i++) {
        num[i] = scanner.nextInt();
    }
        sort(num);

        for (int x : num)
        {
            System.out.println(x);

        }
    }




     static void sort(int[] array){
            int buf;

            for (int i = 0; i < array.length; i++)
            {

                for (int j = 0; j < array.length; j++)
                {
                    if (array[i] > array[j])
                    {
                        buf = array[j];
                        array[j] = array[i];
                        array[i] = buf;

        }}}}}
