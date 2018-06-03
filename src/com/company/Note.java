package com.company;

/**
 * Класс записи в блокноте.
 *
 * Непостредсвтенно сама запись, состоит из конструктора, геттера и сеттера
 *
 */

public class Note {

    private String note;

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}
