package br.com.mateus.bookstore.user.repository;

import br.com.mateus.bookstore.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
