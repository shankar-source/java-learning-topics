package com.example.nplusone.service;

import com.example.nplusone.entity.Post;
import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvancedService {

    private final EntityManager em;

    public AdvancedService(EntityManager em) {
        this.em = em;
    }

    public void fixWithEntityGraph() {
        System.out.println("\n--- ADVANCED: Entity Graph Fix ---");

        EntityGraph<Post> graph = em.createEntityGraph(Post.class);
        graph.addAttributeNodes("author");

        List<Post> posts = em.createQuery("SELECT p FROM Post p", Post.class)
                .setHint("javax.persistence.fetchgraph", graph)
                .getResultList();

        for (Post post : posts) {
            System.out.println(post.getTitle() + " by " + post.getAuthor().getName());
        }
    }
}
