package br.com.mateus.bookstore.publisher.repository;

import br.com.mateus.bookstore.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
