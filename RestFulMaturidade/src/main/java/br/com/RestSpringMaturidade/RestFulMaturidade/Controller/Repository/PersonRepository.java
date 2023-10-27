package br.com.RestSpringMaturidade.RestFulMaturidade.Controller.Repository;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
