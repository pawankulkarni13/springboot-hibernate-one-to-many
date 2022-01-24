package com.stark.springboothibernateonetomany.dao;

import com.stark.springboothibernateonetomany.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubDao extends JpaRepository<Club, Integer> {
}
