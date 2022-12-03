package com.example.projectmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projectmanagementsystem.domain.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}
