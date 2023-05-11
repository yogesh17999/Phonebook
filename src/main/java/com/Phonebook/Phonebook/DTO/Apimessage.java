package com.Phonebook.Phonebook.DTO;

import org.hibernate.annotations.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apimessage {
	
 private HttpStatus status;
 private String message;
 private Object data;
	
	

}
