package br.com.mateus.bookstore.author.repository;

import br.com.mateus.bookstore.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
