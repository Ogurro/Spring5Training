package com.pw.spring5training.repository;

import com.pw.spring5training.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
