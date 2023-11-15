package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {
    public void delete (Student student);

    public List<Student> findAll();
    public Student save(Student student);

    List<Student> findAllBySchoolID(Integer schoolID);

//    public Optional <Student> findById(Integer id);

}
