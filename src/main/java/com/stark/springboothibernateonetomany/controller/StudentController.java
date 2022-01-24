package com.stark.springboothibernateonetomany.controller;

import com.stark.springboothibernateonetomany.dao.ClubDao;
import com.stark.springboothibernateonetomany.dao.StudentDao;
import com.stark.springboothibernateonetomany.entity.Club;
import com.stark.springboothibernateonetomany.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private ClubDao clubDao;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @GetMapping("/students/club")
    public List<Club> getAllClubs() {
        return clubDao.findAll();
    }

}
