package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody School school){
    service.save(school);
    }

//    @GetMapping (value = "/findAll" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Student> findAll(){
//        return service.findAll();
//    }

    @GetMapping (value = "/findAllSchools")
    public ResponseEntity <List<School>> findAll(){
        return  ResponseEntity.ok(service.findAll());
    }

//    @GetMapping (value ="/withStudent{schoolID}")
//    public ResponseEntity <List<FullSchoolResponse >> findAll(
//            @PathVariable ("schoolID") Integer schoolID){
//    return ResponseEntity. ok(service.findSchoolWithStudents(schoolID));
//    };

}
