package com.example.projectmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.projectmanagementsystem.domain.Project;
 
 
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
 
}