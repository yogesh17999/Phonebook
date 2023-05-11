package com.Phonebook.Phonebook.Model;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.query.sqm.FetchClauseType;
import org.springframework.scheduling.support.SimpleTriggerContext;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class Task {

	@Id
	@GeneratedValue
	private int task_id;
	private String task_name;
	private String taskType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Task parentTask;
	
	
	
}
