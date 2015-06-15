package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jeansmits on 15/06/15.
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
