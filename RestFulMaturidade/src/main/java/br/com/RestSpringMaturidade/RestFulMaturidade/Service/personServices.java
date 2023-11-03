package br.com.RestSpringMaturidade.RestFulMaturidade.Service;

import br.com.RestSpringMaturidade.RestFulMaturidade.Controller.PersonController;
import br.com.RestSpringMaturidade.RestFulMaturidade.Controller.Repository.PersonRepository;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Mapper.MapperModel;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import br.com.RestSpringMaturidade.RestFulMaturidade.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class personServices {
    private Logger logger = Logger.getLogger(personServices.class.getName());

    @Autowired
    PersonRepository personRepository;

    public DTOPerson findById(Long id){
        logger.info("Find one Person ");
        DTOPerson dtoPerson = MapperModel.parseObjetc(personRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("No records found for this ID!")
                ), DTOPerson.class
        );
        return dtoPerson.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PersonController.class).findById(id)).withSelfRel());
    }

    public List<DTOPerson> FindAll(){
        List<DTOPerson> dtos = MapperModel.parseListObjects(personRepository.findAll(), DTOPerson.class);
        dtos.stream().forEach(p -> p.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PersonController.class).findById(p.getKey())).withSelfRel()));
        return dtos;
    }

    public DTOPerson CreatePerson(DTOPerson DTOperson){
        logger.info("Created one Person");
        Person personEntity = MapperModel.parseObjetc(DTOperson, Person.class);
        DTOPerson DTOEntity = MapperModel.parseObjetc(personRepository.save(personEntity),DTOPerson.class);
        return DTOEntity.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PersonController.class).findById(DTOEntity.getKey())).withSelfRel());
    }

    public DTOPerson Update(DTOPerson dtoPerson){
        Person entity = personRepository.findById(dtoPerson.getKey())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        entity.setFistName(dtoPerson.getFistName());
        entity.setAddress(dtoPerson.getAddress());
        entity.setGender(dtoPerson.getGender());
        logger.info("An updated Person");
        DTOPerson UpdatedPerson =  MapperModel.parseObjetc(personRepository.save(entity), DTOPerson.class);
        return UpdatedPerson.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PersonController.class).findById(UpdatedPerson.getKey())).withSelfRel());
    }

    public void DeletePerson(Long id){
        Person entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        personRepository.delete(entity);
        logger.info("An delete Person");
    }
}
