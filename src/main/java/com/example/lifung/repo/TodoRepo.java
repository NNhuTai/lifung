package com.example.lifung.repo;

import com.example.lifung.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Tai Nguyen
 */
@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {
    List<Todo> findTodoByUserId(Long id);
}
