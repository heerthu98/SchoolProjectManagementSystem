package com.example.projectmanagementsystem.repository;

import com.example.projectmanagementsystem.domain.Itlab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItlabRepository extends JpaRepository<Itlab, Long> {

}
