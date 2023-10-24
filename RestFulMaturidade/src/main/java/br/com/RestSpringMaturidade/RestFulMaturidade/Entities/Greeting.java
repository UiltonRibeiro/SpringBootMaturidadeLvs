package br.com.RestSpringMaturidade.RestFulMaturidade.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    private final String Content;

    public Greeting(long id, String content) {
        this.id = id;
        Content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return Content;
    }
}
