package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient studentClient;
     public void save(School school){ //normalementr on utilise un DTO
        repository.save(school);
     }
    public List<School> findAll(){
        return repository.findAll();
    };

    public FullSchoolResponse findSchoolWithStudents(Integer schoolID) {
        var school = repository.findById(schoolID)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        var students = studentClient.findALlStudentBySchool(schoolID);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }

//    public Optional<Student> findById(Integer id){
//        return null;
//    };


}
