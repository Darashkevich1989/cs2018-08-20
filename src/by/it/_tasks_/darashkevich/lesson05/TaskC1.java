package by.it._tasks_.darashkevich.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int j = scanner.nextInt();
            num.add(j);
             if (j % 2 == 0&j % 3 == 0){
                n1.add(j);
                n2.add(j);}
            else if (j % 3 == 0){
                n1.add(j);
            }
            else if (j % 2 == 0){
                n2.add(j);
            }
            else if (j % 3 != 0)
                 if (j % 2 != 0) {
                     n3.add(j);
                 }
        }
        printList(n1);
        printList(n2);
        printList(n3);
        }

private static void printList(List<Integer> list){
     System.out.println(list);


}
}


