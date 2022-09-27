package com.example.springinbuiltdatabase;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails{
@Id
	private int Iden;
	private String Name;
	
	public String toString() {
		return Name+" : "+Iden;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Iden;
	}
	public void setId(int id) {
		Iden = id;
	}
}
