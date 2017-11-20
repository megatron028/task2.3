package com.company;

public class Lion {
    private String name;
    private int age;

    public void eat(){

    }
    public void drink(){

    }
    public void sleep(){

    }
    public void miss(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
