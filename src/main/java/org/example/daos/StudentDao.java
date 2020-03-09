package org.example.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {

}
