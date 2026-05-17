package org.ironhack.project.securitylab.controller;


import lombok.RequiredArgsConstructor;
import org.ironhack.project.securitylab.entity.BlogPost;
import org.ironhack.project.securitylab.service.BlogPostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class BlogPostController {

    private final BlogPostService blogPostService;

    @GetMapping("/{id}")
    public BlogPost getPost(@PathVariable Long id) {
        return blogPostService.getPost(id);
    }

    @PostMapping
    public BlogPost addPost(@RequestBody BlogPost post) {
        return blogPostService.addPost(post);
    }

    @PutMapping("/{id}")
    public BlogPost updatePost(@PathVariable Long id,
                               @RequestBody BlogPost post) {

        return blogPostService.updatePost(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        blogPostService.deletePost(id);
    }
}