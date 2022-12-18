package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByAuthorId(UUID id);
}
