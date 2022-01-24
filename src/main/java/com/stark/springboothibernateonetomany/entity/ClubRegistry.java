package com.stark.springboothibernateonetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "club_registry")
public class ClubRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_id")
    Integer regId;

    @ManyToOne
    @JoinColumn(name="s_id", nullable=false)
    @JsonBackReference
    Student student;

    @ManyToOne
    @JoinColumn(name="c_id", nullable=false)
    @JsonManagedReference
    Club club;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
