package com.realdolmen.spring.blog.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jeansmits on 15/06/15.
 */
@Entity
public class Comment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;
    private String content;
    private Date creationDate;

    @ManyToOne
    private BlogPost blogPost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogPost getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(BlogPost blogPost) {
        this.blogPost = blogPost;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void SetCreationDate(Date setCreationDate) {
        this.creationDate = setCreationDate;
    }

    @PrePersist
    public void createComment() {
        setCreationDate(new Date());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
