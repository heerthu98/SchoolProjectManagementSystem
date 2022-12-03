package com.example.projectmanagementsystem.service;

import com.example.projectmanagementsystem.domain.Itlab;
import com.example.projectmanagementsystem.repository.ItlabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItlabService {

    @Autowired
    private ItlabRepository repo;
    public List<Itlab> listAll() {
        return repo.findAll();
    }

    public void saveItlab(Itlab std) {
        repo.save(std);
    }

    public Itlab getitlab(long pcid) {
        return repo.findById(pcid).get();
    }

    public void deleteitlab(long pcid) {
        repo.deleteById(pcid);
    }
}
