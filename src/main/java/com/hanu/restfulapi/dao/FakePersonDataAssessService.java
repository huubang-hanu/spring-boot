package com.hanu.restfulapi.dao;

import com.hanu.restfulapi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAssessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getAge(), null , null, null));
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

}
