package br.com.RestSpringMaturidade.RestFulMaturidade.Controller;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson;
import br.com.RestSpringMaturidade.RestFulMaturidade.Service.personServices;
import br.com.RestSpringMaturidade.RestFulMaturidade.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private personServices personServices;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public DTOPerson findById(@PathVariable(value = "id") Long id){
        return personServices.findById(id);
    }

    @GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public List<DTOPerson> allPeoples(){
        return personServices.FindAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON,produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public DTOPerson createPerson(@RequestBody DTOPerson DTOperson){
        return personServices.CreatePerson(DTOperson);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON,produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public DTOPerson UpdatePerson(@RequestBody DTOPerson DTOperson){
        return personServices.Update(DTOperson);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> DeletePerson(@PathVariable Long id){
        personServices.DeletePerson(id);
        return ResponseEntity.noContent().build();
    }
}
