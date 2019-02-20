package vn.thaitv.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.thaitv.model.Person;
import vn.thaitv.repository.*;

@Service("personServiceImp")
public class PersonServiceImp implements IPersonService {

	@Autowired
	PersonRepository personRepository;

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		// Iterable<Person> iterable=personRepository.findAll();
		// Iterator<Person> s=iterable.iterator();
		List<Person> ls = new ArrayList<>();
		// while (s.hasNext()) {
		// Person s1 = s.next();
		// ls.add(s1);
		// }
		personRepository.findAll().forEach(ls::add);
		return ls;
	}

	@Override
	public boolean save(Person person) {
		personRepository.save(person);
		return personRepository.save(person) != null;
	}

	@Override
	public boolean update(int id, String namePerson, int agePerson) {
		Person person = personRepository.findById(id).get();
		person.setStudentAge(agePerson);
		person.setStudentName(namePerson);
		personRepository.save(person);
		return true;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		Person person = personRepository.findById(id).get();
		if (person != null) {
			personRepository.delete(person);
			return true;
		} else
			return false;
	}
	public List<Person> getDemo(){
		return personRepository.getList();
	}

	@Override
	public List<Person> findByStudentName(String studentName) {
		
		return personRepository.findByStudentNameContaining(studentName);
	}

	@Override
	public List<Person> findAllOrderByStudentIDAsc() {
		// TODO Auto-generated method stub
		return personRepository.findAllByOrderByStudentAgeAsc();
	}

}
