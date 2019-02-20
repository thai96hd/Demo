package vn.thaitv.service;

import java.util.List;

import vn.thaitv.model.Person;

public interface IPersonService {
  List<Person> getAll();
  boolean save(Person person);
  boolean update(int id,String namePerson,int agePerson);
  boolean delete(int id);
  List<Person> getDemo();
  List<Person> findByStudentName(String studentName);
  List<Person> findAllOrderByStudentIDAsc(); 
}
