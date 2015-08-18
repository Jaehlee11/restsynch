package lab.jaehlee11.net.restsynch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.jaehlee11.net.restsynch.domain.Contact;
import lab.jaehlee11.net.restsynch.domain.Person;
import lab.jaehlee11.net.restsynch.repository.ContactRepository;
import lab.jaehlee11.net.restsynch.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	private final PersonRepository personRepository;
	private final ContactRepository contactRepository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository personRepository, ContactRepository contactRepository) {
		this.personRepository = personRepository;
		this.contactRepository = contactRepository;
	}

	@Override
	public Person insertPersion(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Iterable<Person> findAllPerson() {
		return personRepository.findAll();
	}

	@Override
	public Person findPerson(Long id) {
		return personRepository.findOne(id);
	}
	
	@Override
	public Person deletePerson(Long id) {
		Person person = personRepository.findOne(id);
		personRepository.delete(id);
		return person;
	}
	
	@Override
	public Long count() {
		return personRepository.count();
	}
	
	@Override
	public Iterable<Contact> findPersonContract(Long id) {
		return contactRepository.findByPersonId(id);
	}
}
