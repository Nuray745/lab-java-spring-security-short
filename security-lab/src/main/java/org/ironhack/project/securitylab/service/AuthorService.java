package org.ironhack.project.securitylab.service;

import lombok.RequiredArgsConstructor;
import org.ironhack.project.securitylab.entity.Author;
import org.ironhack.project.securitylab.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Long id, Author updatedAuthor) {

        Author author = authorRepository.findById(id).orElseThrow();

        author.setName(updatedAuthor.getName());
        return  authorRepository.save(author);
    }

    public  void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
