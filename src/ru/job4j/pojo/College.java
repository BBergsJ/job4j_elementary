package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Dmitry Vladimirovitch");
        student.setGroup("#272702");
        student.setEntered(new Date());

        System.out.println(student.getFullName() + " from group : "
                + student.getGroup() + ", entered in " + student.getEntered());
    }
}
