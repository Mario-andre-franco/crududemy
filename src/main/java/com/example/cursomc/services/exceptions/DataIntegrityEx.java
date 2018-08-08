package com.example.cursomc.services.exceptions;

public class DataIntegrityEx extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DataIntegrityEx(String msg) {
		super (msg);
	}
	
	public DataIntegrityEx (String msg, Throwable cause) {
		super (msg,cause);
	}

}
