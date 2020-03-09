package org.example.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Long> {

}
