package com.realdolmen.spring.blog.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jeansmits on 15/06/15.
 */
@Entity
public class Blog implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date creationDate;

    @OneToOne
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @PrePersist
    public void createBlog() {
        setCreationDate(new Date());
    }
}
