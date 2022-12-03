package com.example.projectmanagementsystem.service;

import com.example.projectmanagementsystem.domain.Students;
import com.example.projectmanagementsystem.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository repo;
    public List<Students> listAll() {
        return repo.findAll();
    }

    public void saveStudents(Students std) {
        repo.save(std);
    }

    public Students getStudents(long studentsid) {
        return repo.findById(studentsid).get();
    }

    public void deleteStudents(long studentsid) {
        repo.deleteById(studentsid);
    }
}
