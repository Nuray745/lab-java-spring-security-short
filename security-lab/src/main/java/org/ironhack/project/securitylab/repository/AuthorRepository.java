package org.ironhack.project.securitylab.repository;

import org.ironhack.project.securitylab.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
