package com.springcrud;

import org.springframework.data.repository.CrudRepository;

interface Repo extends CrudRepository<Pojo, Integer>  {

}
