package br.com.RestSpringMaturidade.RestFulMaturidade.Service;

import br.com.RestSpringMaturidade.RestFulMaturidade.Controller.Repository.PersonRepository;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import br.com.RestSpringMaturidade.RestFulMaturidade.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class personServices {
    private Logger logger = Logger.getLogger(personServices.class.getName());

    @Autowired
    PersonRepository personRepository;

    public Person findById(String id){
        logger.info("Find one Person ");
        return personRepository.findById(Long.parseLong(id))
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
    }

    public List<Person> FindAll(){
        return personRepository.findAll();
    }

    public Person CreatePerson(Person person){
        logger.info("Created one Person");
        return personRepository.save(person);
    }

    public Person Update(Person person){
        Person entity = personRepository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        entity.setFistName(person.getFistName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        logger.info("An updated Person");
        return personRepository.save(entity);
    }

    public void DeletePerson(Long id){
        Person entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        personRepository.delete(entity);
        logger.info("An delete Person");
    }
}
