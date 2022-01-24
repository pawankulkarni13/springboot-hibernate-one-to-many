package com.stark.springboothibernateonetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    Integer cId;

    @Column(name = "c_name")
    String cName;

    @OneToMany(mappedBy="club")
    @JsonBackReference
    Set<ClubRegistry> studRegistry;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Set<ClubRegistry> getStudRegistry() {
        return studRegistry;
    }

    public void setStudRegistry(Set<ClubRegistry> studRegistry) {
        this.studRegistry = studRegistry;
    }
}
