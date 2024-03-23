package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int num, ind, mode;
        while (flag) {
            System.out.println
                    (
                            """
                                    1)Добавить элемент
                                    2)Удалить элемент
                                    3)Изменить элемент
                                    4)Поиск
                                    5)Напечатать список
                                    0)Выход"""
                    );
            mode = in.nextInt();
            switch (mode) {
                case 1:
                    System.out.println("Введите число и индекс");
                    num = in.nextInt();
                    ind = in.nextInt();
                    list.addElem(num, ind);
                    break;
                case 2:
                    System.out.println("Введите индекс");
                    ind = in.nextInt();
                    list.delElem(ind);
                    break;
                case 3:
                    System.out.println("Введите число и индекс");
                    num = in.nextInt();
                    ind = in.nextInt();
                    list.editElem(num, ind);
                    break;
                case 4:
                    System.out.println("Введите индекс");
                    ind = in.nextInt();
                    list.getElem(ind);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    flag = false;
                    break;
                default:
                    System.out.println("Введено не то значение");
            }
        }
    }
}
