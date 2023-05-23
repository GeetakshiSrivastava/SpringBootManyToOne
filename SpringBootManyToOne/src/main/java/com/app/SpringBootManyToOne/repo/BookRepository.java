package com.app.SpringBootManyToOne.repo;

import com.app.SpringBootManyToOne.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
