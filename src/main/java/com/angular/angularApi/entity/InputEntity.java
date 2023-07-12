package com.angular.angularApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InputEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String type;
	String body;
	public InputEntity() {
		super();
	}
	public InputEntity(Integer id, String type, String body) {
		super();
		this.id = id;
		this.type = type;
		this.body = body;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
