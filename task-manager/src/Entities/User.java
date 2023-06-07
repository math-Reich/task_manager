package Entities;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private Gender gender;
    private Date birthday;
    private ArrayList<Task> tasks;

    public User(String name, Gender gender, Date birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}