package com.springcrud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Empservice {
@Autowired
	Repo repo;

public List<Pojo> allobj() {
	List<Pojo> list=new ArrayList<Pojo>();
	repo.findAll().forEach(list::add);
	return list;
}

public void add(Pojo pojo) {
	repo.save(pojo);
	
}

public void update(int id,Pojo pojo) {
	repo.save(pojo);
	
}


public void delete(int id) {
	repo.deleteById(id);
	
}
	
}
