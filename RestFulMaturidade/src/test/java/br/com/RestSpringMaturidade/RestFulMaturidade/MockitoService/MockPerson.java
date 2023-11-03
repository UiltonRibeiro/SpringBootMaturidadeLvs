package br.com.RestSpringMaturidade.RestFulMaturidade.MockitoService;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;

import java.util.ArrayList;
import java.util.List;

public class MockPerson {

    public Person mockEntity(){
        return mockEntity();
    }

    public DTOPerson mockDTO(){
        return mockDTO();
    }

    public List<Person> mockEntityList(){
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 5; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public Person mockEntity(Integer number){
        Person person = new Person();
        person.setAddress("Addres Test " + number);
        person.setFistName("Person name " + number);
        person.setGender(((number % 2) == 0) ? "Male" : "Famale");
        return person;
    }
}
