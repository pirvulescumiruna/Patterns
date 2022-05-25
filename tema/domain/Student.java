package mriuna.pirvulescu.tema.domain;

public class Student {
    String name;
    Integer group;

    public Student(String name, Integer group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Integer getGroup() {
        return group;
    }
}
