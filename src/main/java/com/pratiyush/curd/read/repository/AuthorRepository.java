package com.pratiyush.curd.read.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pratiyush.curd.read.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
