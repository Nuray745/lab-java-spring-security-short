package org.ironhack.project.securitylab.service;


import lombok.RequiredArgsConstructor;
import org.ironhack.project.securitylab.entity.BlogPost;
import org.ironhack.project.securitylab.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPost getPost(Long id) {
        return blogPostRepository.findById(id).orElseThrow();
    }

    public BlogPost addPost(BlogPost post) {
        return blogPostRepository.save(post);
    }

    public BlogPost updatePost(Long id, BlogPost updatedPost) {

        BlogPost post = blogPostRepository.findById(id).orElseThrow();

        post.setTitle(updatedPost.getTitle());
        post.setPost(updatedPost.getPost());

        return blogPostRepository.save(post);
    }

    public void deletePost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
