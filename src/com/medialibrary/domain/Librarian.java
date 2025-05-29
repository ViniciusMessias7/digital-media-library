package com.medialibrary.domain;

public class Librarian extends Person {
    private final String educationalBackGround;

    public Librarian(String name, String id, String educationalBackGround) {
        super(name, id);
        this.educationalBackGround = educationalBackGround;
    }

    @Override
    public String toString() {
        return "Librarian" +
                "\nName: " + getName() +
                "\nStaff ID: " + getId() +
                "\nEducational BackGround: " + this.educationalBackGround;
    }

    public String getEducationalBackGround() {
        return educationalBackGround;
    }

    public String getStaffId() {
        return getId();
    }

}
