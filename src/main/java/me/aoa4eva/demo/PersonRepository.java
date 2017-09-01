package me.aoa4eva.demo;

import me.aoa4eva.demo.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long>{
}
