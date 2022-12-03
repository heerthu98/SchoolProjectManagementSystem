package com.example.projectmanagementsystem.service;


import com.example.projectmanagementsystem.domain.Supervisor;

import com.example.projectmanagementsystem.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorService {

    @Autowired
    private SupervisorRepository repo;
    public List<Supervisor> listAll() {
        return repo.findAll();
    }

    public void saveSupervisor(Supervisor std) {
        repo.save(std);
    }

    public Supervisor getsupervisor(long supervisorid) {
        return repo.findById(supervisorid).get();
    }

    public void deletesupervisor(long supervisorid) {
        repo.deleteById(supervisorid);
    }
}

