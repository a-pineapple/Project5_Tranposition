package project5ltw.web.api;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import project5ltw.xekhach;
import project5ltw.data.xekhachRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@RestController
@RequestMapping(path = "/xekhach", produces = "application/json")
@CrossOrigin(origins = "*")
public class xekhachController {
	private xekhachRepository xeRep;
	@Autowired
	EntityLinks entityLinks;
	
	public xekhachController(xekhachRepository xeRep) {
		this.xeRep = xeRep;
	}
	
	@GetMapping("/")
	public List <xekhach> getAllXe(){
		List <xekhach> listXe = xeRep.findAll();
		if(listXe.isEmpty()) {
			return null;
		}
		return listXe;
	}
	
	@GetMapping ("/{id}")
	public xekhach findByID(@PathVariable("id") long id) {
		Optional<xekhach> optXe = xeRep.findById(id);
		if(optXe.isPresent()) {
			return optXe.get();
		}
		return null;
	}
}
