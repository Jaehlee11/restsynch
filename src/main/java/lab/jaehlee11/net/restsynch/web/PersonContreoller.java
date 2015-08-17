package lab.jaehlee11.net.restsynch.web;

import java.util.List;

import lab.jaehlee11.net.restsynch.domain.entity.Person;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class PersonContreoller {

    @RequestMapping(value="/")
    public String getUser() {
    	return "Welcome to RestSynch Service...";
    }
    //public Person getUser(@RequestParam(value="id", defaultValue=0L) Long person) {
    @RequestMapping(value="/{person}", method=RequestMethod.GET)
    public Person getUser(@PathVariable Long person) {
    	return new Person(person, "Jae Hun Lee", "jaehlee11@jaehlee11.com.au");
    }

    @RequestMapping(value="/{person}/customers", method=RequestMethod.GET)
    List<Person> getUserCustomers(@PathVariable Long person) {
        return null;
    }

    @RequestMapping(value="/{person}", method=RequestMethod.DELETE)
    public Person deleteUser(@PathVariable Long person) {
    	return null;
    }
}
