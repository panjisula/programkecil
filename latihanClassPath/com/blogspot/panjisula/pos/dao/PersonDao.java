package com.blogspot.panjisula.pos.dao;

import com.blogspot.panjisula.pos.model.Person;

public interface PersonDao{
    void save(Person p);
    void delete(Person p);
    Person getById(Long id);
}                   