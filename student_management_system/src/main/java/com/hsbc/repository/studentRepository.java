package com.hsbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsbc.entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student,Long>{

}
