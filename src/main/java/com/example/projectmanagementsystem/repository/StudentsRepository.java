package com.example.projectmanagementsystem.repository;

import com.example.projectmanagementsystem.domain.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
}
