package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jeansmits on 15/06/15.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findFirst50ByBlogPost_idOrderByCreationDateDesc(Long id);
}
