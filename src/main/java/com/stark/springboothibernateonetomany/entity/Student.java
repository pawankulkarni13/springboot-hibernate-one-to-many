package com.stark.springboothibernateonetomany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    Integer sId;

    @Column(name = "s_name")
    String sName;

    @Column(name= "s_class")
    String sClass;

    @OneToMany(mappedBy="student")
    @JsonManagedReference
    Set<ClubRegistry> clubs;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public Set<ClubRegistry> getClubs() {
        return clubs;
    }

    public void setClubs(Set<ClubRegistry> clubs) {
        this.clubs = clubs;
    }
}
