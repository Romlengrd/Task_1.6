package com.company;

public class Notepad {
    /**
    Класс реализующий методы Блокнота.

     Может добалять, удалять, редактировать и просматривать записи
     @param s-строка/запись в блокноте
     @param n-размер блокнота
     @param d-индекс удляемой записи
     @param k -индекс редактируемой записи
     @param s1-новвя часть строки

     */

    private String s="";
    private int n=10;
    private int i;
    private String[] padNotes=new String[n];

    public Notepad() {
    }

    public void addNote(String s) {
        Note note=new Note();
        note.setNote(s);
        for(i=0;i<n;i++) {
            if (padNotes[i]==null) {
                padNotes[i]=note.getNote();
                System.out.println("Ввендено -" + padNotes[i]);
                break;
            }
        }

    }

    public void deleteNote(int d) {
        padNotes[d]=null;

    }

    public void viewAll() {
        for(i=0;i<n;i++) {
            if (padNotes[i] != null) {
                System.out.println(padNotes[i]);
            }
        }
    }


    public void editNote(int k, String s1) {
        if (padNotes[k-1]==null) {
            System.out.println("Ошибка - Данная запись пуста и не может быть отредактирована");
        } else {
            s = padNotes[k-1];
            padNotes[k-1] = s + s1;
        }
        }



}
