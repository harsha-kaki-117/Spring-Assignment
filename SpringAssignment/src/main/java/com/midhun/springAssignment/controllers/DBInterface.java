package com.midhun.springAssignment.controllers;

import org.springframework.data.repository.CrudRepository;

import com.midhun.springAssignment.model.PersonsModel;

public interface DBInterface extends CrudRepository<PersonsModel, Integer>{

}
