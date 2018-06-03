package com.company;

/**
 *Класс реализующий методы Блокнота.
 *
 *Имеет методы для добавления, просмотра, удаления и изменения записей.
 *
 */

public class Notepad {

    private String s="";
    private int n=10;
    private int i;
    private String[] padNotes=new String[n];


    /**
     * Добавляет запись в массив записей.
     *
     * @param s
     */

    public void addNote(String s) {
        Note note=new Note();
        note.setNote(s);
        for(i=0;i<n;i++) {
            if (padNotes[i]==null) {
                padNotes[i]=note.getNote();
                System.out.println("Ввендено - " + padNotes[i]);
                break;
            }
        }

    }

    /**
     * Удаляет запись с заданным индексом.
     *
     * @param d
     */

    public void deleteNote(int d) {
        padNotes[d-1]=null;

    }

    /**
     * Просмотр всех записей.
     *
     * Выводит элементы массива padNotes.
     */

    public void viewAll() {
        for(i=0;i<n;i++) {
            if (padNotes[i] != null) {
                System.out.println(padNotes[i]);
            }
        }
    }

    /**
     * Редктирование записи блокнота.
     *
     * Позволяет дописывать строку с заданным номером.
     *
     * @param k
     * @param s1
     */

    public void editNote(int k, String s1) {
        if (padNotes[k-1]==null) {
            System.out.println("Ошибка - Данная запись пуста и не может быть отредактирована");
        } else {
            s = padNotes[k-1];
            padNotes[k-1] = s + s1;
        }
        }



}
