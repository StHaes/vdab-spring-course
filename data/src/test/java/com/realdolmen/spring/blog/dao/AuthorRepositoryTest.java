package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import com.realdolmen.spring.blog.domain.Author;
import com.realdolmen.spring.blog.domain.Blog;
import com.realdolmen.spring.blog.domain.BlogPost;
import com.realdolmen.spring.blog.domain.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by cda5732 on 14/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
@ActiveProfiles("test")
@Transactional
// TODO Activate the test profile
// TODO Activate transactions
public class AuthorRepositoryTest {

    // TODO wire in the repository
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BlogPostRepository blogPostRepository;
    @Autowired
    BlogRepository blogRepository;
    @Autowired
    CommentRepository commentRepository;
    // TODO add unit tests to test the repository
    @Before
    public void addSomeStuff(){
        authorRepository.save(new Author("JerrySpringer@gmail.com","JSprings","GXYFH"));
        authorRepository.save(new Author("Daenerys@gmail.com","Dani","Drogon1480"));
        authorRepository.save(new Author("IknowNothing@gmail.com","JonSnow","WildlingChick"));
    }

    @Test
    public void testAuthorExistsInRepository() throws Exception {
        Author author = new Author("thehobbit48@gmail.com","Smeagolboys","trolol");
        authorRepository.saveAndFlush(author);
        assertNotNull(author.getId());
    }

    @Test
    public void testBlogPostExists() throws Exception {
        BlogPost b = new BlogPost();
        blogPostRepository.saveAndFlush(b);
        assertNotNull(b.getId());
    }

    @Test
    public void testBlogExists() throws Exception {
        Blog b = new Blog();
        blogRepository.saveAndFlush(b);
        assertNotNull(b.getId());
    }

    @Test
    public void testCommentExists() throws Exception {
        Comment c = new Comment();
        commentRepository.saveAndFlush(c);
        assertNotNull(c.getId());
    }

    @Test
    public void testCreatesListOfComments() throws Exception {
        Comment a = new Comment();
        Comment b = new Comment();
        Comment c = new Comment();
        commentRepository.save(a);
        commentRepository.save(b);
        commentRepository.save(c);
        assertNotNull(commentRepository.findFirst50ByBlogPost_idOrderByCreationDateDesc(c.getId()).size());
    }

    @Test
    public void testFindAllByUserName() throws Exception {
        assertEquals("Dani", authorRepository.findAll(new Sort("userName")).get(0).getUserName());
    }
}
