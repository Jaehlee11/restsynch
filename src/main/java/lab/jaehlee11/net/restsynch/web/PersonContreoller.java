package lab.jaehlee11.net.restsynch.web;

import java.io.IOException;

import lab.jaehlee11.net.restsynch.domain.Contact;
import lab.jaehlee11.net.restsynch.domain.Person;
import lab.jaehlee11.net.restsynch.service.PersonService;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class PersonContreoller {
	
	@Autowired
	private PersonService personService;
	
	private ObjectMapper mapper = new ObjectMapper();

    @RequestMapping(value="/")
    public Iterable<Person> getPersons() {
    	return personService.findAllPerson();
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public Person newPerson(@RequestParam(value="jsonPeron", defaultValue="") String jsonPeron) {
    	Person person = null;
    	try {
    		person = mapper.readValue(jsonPeron, Person.class);
    		if(person != null) {
    			person = personService.insertPersion(person);
    		}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return person;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Person getPerson(@PathVariable Long id) {
    	return personService.findPerson(id);
    }

    @RequestMapping(value="/{id}/contracts", method=RequestMethod.GET)
    Iterable<Contact> getPersonContracts(@PathVariable Long id) {
        return personService.findPersonContact(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public Person deletePerson(@PathVariable Long id) {
    	return personService.deletePerson(id);
    }
}
