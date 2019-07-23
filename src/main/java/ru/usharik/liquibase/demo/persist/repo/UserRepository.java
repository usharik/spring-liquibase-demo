package ru.usharik.liquibase.demo.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.usharik.liquibase.demo.persist.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
