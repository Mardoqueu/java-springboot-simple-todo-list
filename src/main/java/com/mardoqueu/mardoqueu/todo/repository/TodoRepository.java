package com.mardoqueu.mardoqueu.todo.repository;

import com.mardoqueu.mardoqueu.todo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
