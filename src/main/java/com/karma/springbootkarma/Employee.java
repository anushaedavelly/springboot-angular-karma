package com.karma.springbootkarma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  @GeneratedValue
  private int id;
  @Column
  private String name;
  @Column
  private String email;
  @Column
  private String text;
public Employee(int id, String name, String email, String text) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.text = text;
}
public Employee() {
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
  
}
