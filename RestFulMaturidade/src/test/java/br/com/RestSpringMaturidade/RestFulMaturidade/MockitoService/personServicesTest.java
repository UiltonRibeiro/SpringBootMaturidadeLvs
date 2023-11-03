package br.com.RestSpringMaturidade.RestFulMaturidade.MockitoService;

import br.com.RestSpringMaturidade.RestFulMaturidade.Controller.Repository.PersonRepository;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import br.com.RestSpringMaturidade.RestFulMaturidade.Service.personServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class personServicesTest {

    MockPerson Input;

    @InjectMocks
    private personServices services;

    @Mock
    PersonRepository personRepository;

    @BeforeEach
    void setUpMock(){
        Input = new MockPerson();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findById() {
        Person person = Input.mockEntity();
        person.setId(1L);
        when(personRepository.findById(1L)).thenReturn(Optional.of(person));

        var personReturn = personRepository.findById(1L);
        assertNotNull(personReturn.get().getId());
    }

    @Test
    void findAll() {
    }

    @Test
    void createPerson() {
    }

    @Test
    void update() {
    }

    @Test
    void deletePerson() {
    }
}