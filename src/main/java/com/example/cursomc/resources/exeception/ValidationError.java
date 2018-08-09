package com.example.cursomc.resources.exeception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardErro {

	private static final long serialVersionUID = 8149787984151880243L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName,messagem));
	}
	
	
}
