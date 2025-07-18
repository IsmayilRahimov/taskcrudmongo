package org.example.taskcrudmongo.controller;

import lombok.RequiredArgsConstructor;
import org.example.taskcrudmongo.dto.Students;
import org.example.taskcrudmongo.service.StudentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor

public class StudentsController {
    private final StudentsService studentService;
    @GetMapping("/students")

    public List<Students> getAll(){
        return studentService.getAll();
    }
}
