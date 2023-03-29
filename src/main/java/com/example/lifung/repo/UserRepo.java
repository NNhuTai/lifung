package com.example.lifung.repo;

import com.example.lifung.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tai Nguyen
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
