package net.java.hospitalmanagement.model;

public class User {
 private int id;
 private String name;
 private String email;
 private String location;
 // Creating Getter setter method
 
 
public int getId() {
	return id;
}
public User(String name, String email, String location) {
	super();
	this.name = name;
	this.email = email;
	this.location = location;
}
public User(int id, String name, String email, String location) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.location = location;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
 
}
