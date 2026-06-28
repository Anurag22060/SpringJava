package com.springAutomation.RESTAPIs.controller;

import com.springAutomation.RESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4,"mohan","mohan@gmail.com");
    }

}
