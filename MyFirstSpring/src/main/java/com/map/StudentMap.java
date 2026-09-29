package com.map;

import java.util.Map;

public class StudentMap {

    private int id;
    private String name;
    private Map<String, Double> course_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getCourse_name() {
        return course_name;
    }

    public void setCourse_name(Map<String, Double> course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course_name=" + course_name + "]";
    }

    public void display() {

        for (Map.Entry<String, Double> entry : course_name.entrySet()) {

            String course = entry.getKey();
            Double marks = entry.getValue();

            System.out.println("Course: " + course + " Marks: " + marks);
        }
    }
}