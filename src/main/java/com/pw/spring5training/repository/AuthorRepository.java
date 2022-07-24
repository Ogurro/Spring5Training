package com.pw.spring5training.repository;

import com.pw.spring5training.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
