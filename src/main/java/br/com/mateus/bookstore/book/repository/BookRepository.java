package br.com.mateus.bookstore.book.repository;

import br.com.mateus.bookstore.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
