package com.Phonebook.Phonebook.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.Phonebook.Phonebook.DTO.TaskDto;
import com.Phonebook.Phonebook.DTO.UpdateTaskDto;
import com.Phonebook.Phonebook.Model.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {
	
	  Task toTask(TaskDto dto);
	   TaskDto toDto(Task task);
	   
	   UpdateTaskDto toupdatetaskdto(Task task);
	   
	   
	  
	   Task UpdatedtoToTask(UpdateTaskDto dto);

}
