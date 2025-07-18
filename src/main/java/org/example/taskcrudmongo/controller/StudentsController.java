package org.example.taskcrudmongo.controller;

import lombok.RequiredArgsConstructor;
import org.example.taskcrudmongo.dto.Students;
import org.example.taskcrudmongo.service.StudentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mongodb")

public class StudentsController {
    private final StudentsService studentService;
    private final StudentsService studentsService;

    @GetMapping("/getAll")

    public List<Students> getAll() {
        return studentService.getAll();
    }

    @PostMapping("/save")

    public Students save(@RequestBody Students students) {
        return studentService.save(students);
    }

    @GetMapping("/getById/{id}")
    public Students getById(@PathVariable String id) {
        return studentService.getById(id);
    }
    @DeleteMapping( "/delete")
    public void delete(String id){
        studentService.delete(id);
    }
}
