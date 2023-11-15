package com.example.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository  extends JpaRepository <School, Integer> {

    public List<School> findAll();
    public School save(School school);
}
