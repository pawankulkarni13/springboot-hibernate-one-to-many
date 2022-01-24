package com.stark.springboothibernateonetomany.dao;

import com.stark.springboothibernateonetomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}
