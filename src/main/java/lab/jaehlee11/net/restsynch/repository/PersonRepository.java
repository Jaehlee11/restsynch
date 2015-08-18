package lab.jaehlee11.net.restsynch.repository;

import org.springframework.data.repository.CrudRepository;

import lab.jaehlee11.net.restsynch.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}