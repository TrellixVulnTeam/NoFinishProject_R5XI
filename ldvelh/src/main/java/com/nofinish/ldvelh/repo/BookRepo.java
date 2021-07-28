package com.nofinish.ldvelh.repo;

import com.nofinish.ldvelh.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {

    Book findByTitle(String title);


}
