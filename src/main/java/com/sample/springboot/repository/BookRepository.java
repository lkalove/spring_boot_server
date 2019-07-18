package com.sample.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.sample.springboot.model.*;

public class BookRepository extends CrudRepository<Book, Integer>{
}
