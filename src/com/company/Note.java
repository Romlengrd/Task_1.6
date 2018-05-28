package com.company;

public class Note {

    /**
     * Класс записи в блокноте.
     *
     * Непостредсвтенно сама запись, состоит из конструктора, геттера и сеттера
     * @param note поле записи
     * @return note возвращает саму запись.
     */
    private String note;


    public Note() {

    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}
