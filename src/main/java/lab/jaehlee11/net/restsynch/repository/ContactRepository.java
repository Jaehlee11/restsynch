package lab.jaehlee11.net.restsynch.repository;

import org.springframework.data.repository.CrudRepository;

import lab.jaehlee11.net.restsynch.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	Iterable<Contact> findByPersonId(Long id);
}