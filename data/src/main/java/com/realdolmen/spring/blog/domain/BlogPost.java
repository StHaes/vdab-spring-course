package com.realdolmen.spring.blog.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jeansmits on 15/06/15.
 */
@Entity
public class BlogPost implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Date creationDate;
    private Date updatedDate;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    @PrePersist
    @PreUpdate
    public void updateBlogPost() {
        Date now = new Date();
        if (creationDate == null) {
            setCreationDate(now);
        }
        setUpdatedDate(now);
    }

}
