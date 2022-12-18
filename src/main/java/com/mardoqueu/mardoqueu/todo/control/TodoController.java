package com.mardoqueu.mardoqueu.todo.control;

import com.mardoqueu.mardoqueu.todo.model.TodoItem;
import com.mardoqueu.mardoqueu.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepository.findAll();
    }

    @PostMapping
    public TodoItem save(@Validated @NonNull @RequestBody TodoItem todoItem){
        return todoRepository.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Validated @NonNull @RequestBody TodoItem todoItem){
        return todoRepository.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepository.deleteById(id);
    }

}
