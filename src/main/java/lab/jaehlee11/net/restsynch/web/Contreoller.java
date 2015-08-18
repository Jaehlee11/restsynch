package lab.jaehlee11.net.restsynch.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contreoller {

    @RequestMapping(value="/")
    public String root() {
    	return "Welcome to RestSynch Service...";
    }
}
