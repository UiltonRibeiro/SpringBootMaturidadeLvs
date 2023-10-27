package br.com.RestSpringMaturidade.RestFulMaturidade.Controller;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import br.com.RestSpringMaturidade.RestFulMaturidade.Service.personServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private personServices personServices;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id){
        return personServices.findById(id);
    }

    @GetMapping("/all")
    public List<Person> allPeoples(){
        return personServices.FindAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person createPerson(@RequestBody Person person){
        return personServices.CreatePerson(person);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person UpdatePerson(@RequestBody Person person){
        return personServices.CreatePerson(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeletePerson(@PathVariable Long id){
        personServices.DeletePerson(id);
        return ResponseEntity.noContent().build();
    }
}
