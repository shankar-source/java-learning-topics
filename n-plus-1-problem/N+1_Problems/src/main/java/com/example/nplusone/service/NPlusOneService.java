package com.example.nplusone.service;

import com.example.nplusone.entity.Post;
import com.example.nplusone.repo.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NPlusOneService {

    private final PostRepository postRepository;

    public NPlusOneService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional(readOnly = true)
    public void showNPlusOneProblem() {
        System.out.println("\n--- BASIC: N+1 Problem ---");
        List<Post> posts = postRepository.findAll(); // 1 query for posts
        for (Post post : posts) {
            // Triggers extra queries for authors
            System.out.println(post.getTitle() + " by " + post.getAuthor().getName());
        }
    }

    @Transactional(readOnly = true)
    public void fixWithJoinFetch() {
        System.out.println("\n--- INTERMEDIATE: JOIN FETCH Fix ---");
        List<Post> posts = postRepository.findAllWithAuthors(); // 1 query with join
        for (Post post : posts) {
            System.out.println(post.getTitle() + " by " + post.getAuthor().getName());
        }
    }
}
