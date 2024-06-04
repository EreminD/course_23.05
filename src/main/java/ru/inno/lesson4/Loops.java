package ru.inno.lesson4;

public class Loops {

    public static void main(String[] args) {

        Student[] group = new Student[8];
        group[0] = new Student("Алена", "Швайка");
        group[1] = new Student("Анна", "");
        group[2] = new Student("Вадим", "");
        group[3] = new Student("Галина", "Смирнова");
        group[4] = new Student("Данила", "Аникин");
        group[5] = new Student("Камиль", "Немов");
        group[6] = new Student("Милана", "");
        group[7] = new Student("Ренат", "");

        group[0].isPresent = false;
        group[3].isPresent = false;
        group[4].isPresent = false;

        ///////////////

        for (int i = 0; i < group.length; i = i + 1) {
            System.out.println("i = " + i);
            String info = group[i].firstName + " " + group[i].lastName + " –---> " + group[i].isPresent;
            System.out.println(info);
        }

        System.out.println("//////");

        for (Student student : group) {
            String info = student.firstName + " " + student.lastName + " –---> " + student.isPresent;
            System.out.println(info);
        }
    }
}
