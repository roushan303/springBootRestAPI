package com.routech.sprintBootRest.services;

import com.routech.sprintBootRest.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses();

    public Courses getCourse(long courseId);

    public Courses createCourse(Courses course);

    public Courses updateCourse(Courses course);
}
