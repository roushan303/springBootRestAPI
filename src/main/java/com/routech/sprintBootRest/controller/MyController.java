package com.routech.sprintBootRest.controller;

import com.routech.sprintBootRest.entities.Courses;
import com.routech.sprintBootRest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }


    // Getting all the batches

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses createCourse(@RequestBody Courses course){
        return this.courseService.createCourse(course);
    }

    @PutMapping("/courses")
    public  Courses updateCourse(@RequestBody Courses course){
        return this.courseService.updateCourse(course);
    }
}
