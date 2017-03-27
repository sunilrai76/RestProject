package com.ultra.ws.rest.domain;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2247967012586121809L;
	private String id;
	private String name;
	private String authore;

	public Book() {
	}

	public Book(String id, String name, String authore) {
		this.id = id;
		this.name = name;
		this.authore = authore;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthore() {
		return authore;
	}

	public void setAuthore(String authore) {
		this.authore = authore;
	}
}
