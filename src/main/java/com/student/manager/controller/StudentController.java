package com.student.manager.controller;

import com.student.manager.entity.Student;
import com.student.manager.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository repository)
    {
        this.studentRepository = repository;
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getbyId(@PathVariable Long id)
    {
        return studentRepository.getReferenceById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }


}
