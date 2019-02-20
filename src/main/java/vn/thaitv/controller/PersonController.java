package vn.thaitv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.thaitv.model.Person;
import vn.thaitv.service.IPersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	IPersonService personService;

	@GetMapping("/getAll")
	public List<Person> getAll() {
		return personService.getAll();
	}
	@GetMapping("/getAll1")
	public List<Person> getAll2() {
		return personService.findAllOrderByStudentIDAsc();
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable(name = "id") int id, @RequestParam(name = "namePerson") String name,
			@RequestParam(name = "agePerson") int age) {
		personService.update(id, name, age);
	}

	@PostMapping("/insert")
	
	public void insert(@RequestBody Person person) {
		personService.save(person);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) {
		personService.delete(id);
	}
	@GetMapping("get/{name}")
	public List<Person> get(@PathVariable("name")String name) {
		return personService.findByStudentName(name);
	}

}
