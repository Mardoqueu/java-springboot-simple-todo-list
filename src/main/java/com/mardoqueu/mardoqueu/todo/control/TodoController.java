package com.mardoqueu.mardoqueu.todo.control;

import com.mardoqueu.mardoqueu.todo.model.TodoItem;
import com.mardoqueu.mardoqueu.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;


    public List<TodoItem> findAll(){
        return todoRepository.findAll();
    }
}
