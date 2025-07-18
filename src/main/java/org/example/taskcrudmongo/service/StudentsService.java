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

    public List<Students> getAll() {
        return studentsRepository.findAll();
    }

    public Students save(Students students) {
        return studentsRepository.save(students);
    }

    public Students getById(String id) {
        return studentsRepository.findById(Long.valueOf(id)).orElse(null);
    }

    public void delete(String id) {
        studentsRepository.deleteById(Long.valueOf(id));
    }
}
