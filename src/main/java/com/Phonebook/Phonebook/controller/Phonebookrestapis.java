package com.Phonebook.Phonebook.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phonebook.Phonebook.DTO.Apimessage;
import com.Phonebook.Phonebook.DTO.TaskDto;
import com.Phonebook.Phonebook.DTO.UpdateTaskDto;
import com.Phonebook.Phonebook.Model.Task;
import com.Phonebook.Phonebook.Service.TaskService;


@RestController
@RequestMapping("/api")
public class Phonebookrestapis {
	
	
	@Autowired
	TaskService service;

	@PostMapping("/")
	public ResponseEntity<?> addtask(TaskDto dto)
	{
		   Apimessage apimessage= service.addTask(dto);
		   return ResponseEntity.status(apimessage.getStatus()).body(apimessage);
	}
	
	@PutMapping("/")
	public ResponseEntity<?> updatetask(UpdateTaskDto updateTaskDto)
	{
		
		   Apimessage apimessage= service.UpdateTask(updateTaskDto);
		   return ResponseEntity.status(apimessage.getStatus()).body(apimessage);

	}

	
	
	
}
