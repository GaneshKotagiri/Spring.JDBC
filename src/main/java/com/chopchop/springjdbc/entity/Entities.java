package com.chopchop.springjdbc.entity;

import org.springframework.stereotype.Component;

@Component
public class Entities {
    private int Id;
    private String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    private int Marks;

    @Override
    public String toString() {
        return "Entities{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Marks='" + Marks + '\'' +
                '}';
    }
}
