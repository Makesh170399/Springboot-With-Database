package com.springcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empcontroller {

	@Autowired
	Empservice emp;

	@RequestMapping("/index")
	public List<Pojo> all() {
		return emp.allobj();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/index/add/{id}")
	
	// @PostMapping("/index/add/{id}")
	public void add(@PathVariable int id, @RequestBody Pojo pojo) {
		emp.add(pojo);
	}
	// @PostMapping("/index/{id}")
	/*
	 * If i use postmapping then i can't use PUT,DELETE,PUT. I can use only 
	 * POST.So if we need to use put,post,delete need to use @Requestmappping
	 */

	@RequestMapping(method = RequestMethod.PUT, value = "/index/{id}")
	public  void  update(@PathVariable int id, @RequestBody Pojo pojo) {
		emp.update(id, pojo);
		
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/index/delete/{id}")
	public void delete(@PathVariable int id) {
		emp.delete(id);
	}

}
