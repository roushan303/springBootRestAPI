package com.routech.sprintBootRest.services;

import com.routech.sprintBootRest.dao.CourseDao;
import com.routech.sprintBootRest.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl(){

    }

    @Override
    public List<Courses> getCourses() {
       return courseDao.findAll();
    }

    @Override
    public Courses getCourse(long courseId) {
        return courseDao.getById(courseId);
    }

    @Override
    public Courses createCourse(Courses course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Courses updateCourse(Courses course) {
        courseDao.save(course);
        return course;
    }

}
