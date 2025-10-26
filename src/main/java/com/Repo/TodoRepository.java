package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Models.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Long> {
    List<Todo> findByUsername(String username);
    List<Todo> findByUsernameAndCompleted(String username,boolean completed);
    List<Todo>  findByUsernameOrderByIdAsc(String  username);
    List<Todo>  findByUsernameOrderByIdDesc(String username);
}