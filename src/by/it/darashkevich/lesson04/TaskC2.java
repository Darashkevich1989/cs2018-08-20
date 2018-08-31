package by.it._tasks_.darashkevich.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int k;


            switch (m) {

                case 1:
                    k = d;System.out.println(k);
                    break;
                case 2:
                    k = 31 + d;System.out.println(k);
                    break;
                case 3:
                    k = 59 + d;System.out.println(k);
                    break;
                case 4:
                    k = 90 + d;System.out.println(k);
                    break;
                case 5:
                    k = 120 + d;System.out.println(k);
                    break;
                case 6:
                    k = 151 + d;System.out.println(k);
                    break;
                case 7:
                    k = 181 + d;System.out.println(k);
                    break;
                case 8:
                    k = 212 + d;System.out.println(k);
                    break;
                case 9:
                    k = 243 + d;System.out.println(k);
                    break;
                case 10:
                    k = 273 + d;System.out.println(k);
                    break;
                case 11:
                    k = 304 + d;System.out.println(k);
                    break;
                case 12:
                    k = 334 + d;System.out.println(k);
                    break;
                default:break;


            }


        }

}
