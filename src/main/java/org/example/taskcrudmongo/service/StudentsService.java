package org.example.taskcrudmongo.service;

import lombok.RequiredArgsConstructor;
import org.example.taskcrudmongo.dto.Students;
import org.example.taskcrudmongo.repository.StudentsRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
@RequiredArgsConstructor


public class StudentsService {
    private final StudentsRepository studentsRepository;
    @GetMapping

    public List<Students> getAll(){
        return studentsRepository.findAll();
    }
}
