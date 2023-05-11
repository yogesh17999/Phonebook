package com.Phonebook.Phonebook.DTO;

import com.Phonebook.Phonebook.Model.Task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
	
	private String task_name;
	private String taskType;
	private Task parentTask;


}
