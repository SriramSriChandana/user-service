package com.sr.user_service.Secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.user_service.Secure.model.Person;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
    boolean existsByUsername(String username);
    List<Person> findByStatus(int status);
}
