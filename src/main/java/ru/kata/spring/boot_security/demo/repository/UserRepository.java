package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u from User u join fetch u.roles where u.login=:login")
    User getReferenceByLogin(String login);

    @Query("SELECT u FROM User u join fetch u.roles")
    List<User> findAll();

    @Query("SELECT u FROM User u join fetch u.roles where u.id=:id")
    User getReferenceById(Long id);
}
