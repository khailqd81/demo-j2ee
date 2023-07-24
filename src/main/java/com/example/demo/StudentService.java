package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<>();

    private static StudentService instance = new StudentService();

    public static StudentService getInstance() {
        return instance;
    }

    public List<Student> getList() {
        return list;
    }

    public Student add(Student s) {
        s.setId(list.size());
        list.add(s);
        return s;
    }

    public Student getById(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
