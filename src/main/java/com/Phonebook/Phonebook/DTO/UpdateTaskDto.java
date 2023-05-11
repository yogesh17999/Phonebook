package com.Phonebook.Phonebook.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTaskDto {
	
	private String task_name;
	private String taskType;
	private int parentTaskid;
	

}
