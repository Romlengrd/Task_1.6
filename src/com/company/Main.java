package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            int opt =0;
            Notepad notepad = new Notepad();
            while (opt!=5) {
                System.out.printf("Выберети действие 1-посмотреть все записи 2-добавить запись,%n 3-удалить по номеру, 4-редактировать по номеру, 5 - выход%n");
                System.out.println("Емкость записей - 10");
                opt = sc.nextInt();
                if (opt != 1 & opt != 2 & opt != 3 & opt != 4 & opt != 5) {
                    System.out.println("Вариант выбран не верно");
                    return;
                }


                if (opt == 1) {
                    notepad.viewAll();

                }
                if (opt == 2) {
                    System.out.println("Введите запись");
                    String s = sc.next();
                    notepad.addNote(s);
                }
                if (opt == 3) {
                    System.out.println("Введите номер удаляемой записи");
                    int d = sc.nextInt();
                    notepad.deleteNote(d);
                }
                if (opt == 4) {
                    System.out.println("Введите номер ред.записи 1-10");
                    int k = sc.nextInt();
                    if (k>0 & k<10) {
                        System.out.println("Вводите новые символы");
                        String s1 = sc.next();
                        notepad.editNote(k, s1);
                    } else {System.out.println("неверноый номер");}
                }
            }


            sc.close();

        }
        catch (InputMismatchException e) {
            System.out.println("Введено не корректное число/символ");
        }
    }
}
