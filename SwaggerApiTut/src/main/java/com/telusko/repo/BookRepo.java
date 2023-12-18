package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
