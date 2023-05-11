package com.Phonebook.Phonebook.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Phonebook.Phonebook.Model.Task;

public interface Taskrepo extends JpaRepository<Task,Integer>{

}
