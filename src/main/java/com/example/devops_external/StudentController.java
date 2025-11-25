package com.example.devops_external;

import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student s) {
        return service.add(s);
    }

    @GetMapping
    public Collection<Student> all() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable int id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        return service.update(id, s);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
