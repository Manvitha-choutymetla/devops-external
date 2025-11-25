package com.example.devops_external;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    private Map<Integer, Student> db = new HashMap<>();

    public Student add(Student s) {
        db.put(s.getId(), s);
        return s;
    }

    public Collection<Student> getAll() {
        return db.values();
    }

    public Student get(int id) {
        return db.get(id);
    }

    public Student update(int id, Student s) {
        db.put(id, s);
        return s;
    }

    public String delete(int id) {
        db.remove(id);
        return "deleted";
    }
}
