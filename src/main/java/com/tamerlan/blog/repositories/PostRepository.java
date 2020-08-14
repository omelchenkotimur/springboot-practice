package com.tamerlan.blog.repositories;

import com.tamerlan.blog.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {
}
