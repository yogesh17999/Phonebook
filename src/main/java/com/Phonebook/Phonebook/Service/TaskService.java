package com.Phonebook.Phonebook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Phonebook.Phonebook.DTO.Apimessage;
import com.Phonebook.Phonebook.DTO.TaskDto;
import com.Phonebook.Phonebook.DTO.UpdateTaskDto;
import com.Phonebook.Phonebook.Mapper.TaskMapper;import com.Phonebook.Phonebook.Model.Task;
import com.Phonebook.Phonebook.Reposetory.Taskrepo;

import jdk.javadoc.doclet.Reporter;


@Service
public class TaskService {
	
	@Autowired
	Taskrepo taskrepo;
	
	@Autowired
	TaskMapper taskmapper;
	
	
	public Apimessage addTask(TaskDto dto)
	{

		   Task task=  taskrepo.save(taskmapper.toTask(dto));
		    return new Apimessage(HttpStatus.CREATED, "task creted", taskmapper.toDto(task));
		
	}
	
	public Apimessage UpdateTask(UpdateTaskDto dto)
	{
		  Task task=  taskmapper.UpdatedtoToTask(dto);
		  taskrepo.save(task);
		  return new Apimessage(HttpStatus.OK,"Done", taskmapper.toupdatetaskdto(task));
	}
	

}
