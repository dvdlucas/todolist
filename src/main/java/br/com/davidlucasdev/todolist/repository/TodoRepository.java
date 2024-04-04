package br.com.davidlucasdev.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.davidlucasdev.todolist.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
