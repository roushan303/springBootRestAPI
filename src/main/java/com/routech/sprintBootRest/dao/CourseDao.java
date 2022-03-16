package com.routech.sprintBootRest.dao;

import com.routech.sprintBootRest.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses, Long> {
}
