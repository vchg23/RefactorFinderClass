package ru.esphere.school.data;

public class Member {
    private final String name;
    private final Integer age;

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


}
