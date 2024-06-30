package ru.inno.lesson11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lesson {

    private LocalDateTime date;
    private String topic;
    private String lector;
    private List<String> students;

    public Lesson(LocalDateTime date, String topic, String lector) {
        this.date = date;
        this.topic = topic;
        this.lector = lector;
        this.students = new ArrayList<>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getTopic() {
        return topic;
    }

    public String getLector() {
        return lector;
    }

    public List<String> getStudents() {
        return students;
    }

    public int addStudent(String name){
        this.students.add(name);
        return this.students.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson lesson)) return false;
        return Objects.equals(getDate(), lesson.getDate()) && Objects.equals(getTopic(), lesson.getTopic()) && Objects.equals(getLector(), lesson.getLector()) && Objects.equals(getStudents(), lesson.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getTopic(), getLector(), getStudents());
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "date=" + date +
                ", topic='" + topic + '\'' +
                ", lector='" + lector + '\'' +
                ", students=" + students +
                '}';
    }
}
