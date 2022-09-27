package com.example.springinbuiltdatabase;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<UserDetails, Integer>{

}
