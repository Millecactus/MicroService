package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Student student){
    service.save(student);
    }

//    @GetMapping (value = "/findAll" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Student> findAll(){
//        return service.findAll();
//    }

    @GetMapping (value = "/findAllStudents")
    public ResponseEntity <List<Student>> findAll(){
        return  ResponseEntity.ok(service.findAll());
    }

    @GetMapping (value = "/school/{schoolID}")
    public ResponseEntity <List<Student>> findAll(
            @PathVariable ("schoolID") Integer schoolID){
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolID));

    }



}
