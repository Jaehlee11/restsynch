package lab.jaehlee11.net.restsynch.domain;

import lab.jaehlee11.net.restsynch.domain.entity.Person;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {

}