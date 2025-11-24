package com.example.nplusone;

import com.example.nplusone.entity.Author;
import com.example.nplusone.entity.Post;
import com.example.nplusone.repo.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    public DataLoader(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) {
        for (int i = 1; i <= 5; i++) {
            Author author = new Author();
            author.setName("Author " + i);

            for (int j = 1; j <= 5; j++) {
                Post post = new Post();
                post.setTitle("Post " + j + " of Author " + i);
                post.setAuthor(author);
                author.getPosts().add(post);
            }
            authorRepository.save(author);
        }
    }
}
