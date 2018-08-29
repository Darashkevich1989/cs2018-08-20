package by.it._tasks_.darashkevich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.List;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String>STR=new ArrayList<>();
        String A = "QW";
        String B ="ER";
        String C ="TY";
        String D = "IO";
        String E= "AS";
        STR.add(A);
        STR.add(B);
        STR.add(C);
        STR.add(D);
        STR.add(E);
        System.out.println(STR.size());
        for (String i : STR)
            System.out.println(i);


    }

}
