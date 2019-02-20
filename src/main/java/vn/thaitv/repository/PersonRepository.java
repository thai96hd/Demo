package vn.thaitv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.thaitv.model.Person;

@Repository("personRepository")
public interface PersonRepository extends CrudRepository<Person, Integer> {
	@Query(value = "select p from Person p")
	public List<Person> getList();

	public List<Person> findByStudentNameContaining(String studentName);

	public List<Person> findAllByOrderByStudentAgeAsc();
}
