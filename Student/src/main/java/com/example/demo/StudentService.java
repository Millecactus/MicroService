package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class StudentService {

    private final StudentRepository repository;
     public void save(Student student){ //normalementr on utilise un DTO
        repository.save(student);
     }
    public List<Student> findAll(){
        return repository.findAll();
    };
    public List<Student> findAllStudentsBySchool(Integer schoolID) {

        return  repository.findAllBySchoolID(schoolID);
    }

//    public Optional<Student> findById(Integer id){
//        return null;
//    };

}
