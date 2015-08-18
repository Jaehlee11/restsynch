package lab.jaehlee11.net.restsynch.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lab.jaehlee11.net.restsynch.domain.Contact;
import lab.jaehlee11.net.restsynch.domain.Person;
import lab.jaehlee11.net.restsynch.service.PersonService;

@RestController
@RequestMapping(value="/person")
public class PersonContreoller {
	
	@Autowired
	private PersonService personService;

    @RequestMapping(value="/")
    public Iterable<Person> getPersons() {
    	return personService.findAllPerson();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Person getPerson(@PathVariable Long id) {
    	return personService.findPerson(id);
    }

    @RequestMapping(value="/{id}/contracts", method=RequestMethod.GET)
    Iterable<Contact> getPersonContracts(@PathVariable Long id) {
        return personService.findPersonContract(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public Person deletePerson(@PathVariable Long id) {
    	return personService.deletePerson(id);
    }
}
