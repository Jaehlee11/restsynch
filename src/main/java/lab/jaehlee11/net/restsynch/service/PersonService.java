package lab.jaehlee11.net.restsynch.service;

import lab.jaehlee11.net.restsynch.domain.Contact;
import lab.jaehlee11.net.restsynch.domain.Person;

public interface PersonService {

	Long count();
	
	Person insertPersion(Person person);
	
	Iterable<Person> findAllPerson();

	Person findPerson(Long id);
	
	Person deletePerson(Long id);
	
	Iterable<Contact> findPersonContract(Long id);
}
