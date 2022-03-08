package com.app.criatsoft.main.adminException;

public class PageNotFound  extends RuntimeException{
	
	public PageNotFound(String msg) {
		super(msg);
		System.out.println("call");
	}

}
