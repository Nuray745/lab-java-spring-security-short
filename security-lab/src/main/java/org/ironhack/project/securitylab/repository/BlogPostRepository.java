package org.ironhack.project.securitylab.repository;

import org.ironhack.project.securitylab.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
}
