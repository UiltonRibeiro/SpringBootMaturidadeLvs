package br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Objects;

@JsonPropertyOrder({"key","fistName","address","gender"})
public class DTOPerson extends RepresentationModel<DTOPerson> implements Serializable {

    private static long serialVersionUID = 1l;
    @JsonProperty("id")
    private long key;
    private String fistName;
    private String address;
    private String gender;


    public DTOPerson() {
    }

    public DTOPerson(long key, String fistName, String address, String gender) {
        this.key = key;
        this.fistName = fistName;
        this.address = address;
        this.gender = gender;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        DTOPerson.serialVersionUID = serialVersionUID;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTOPerson DTOPerson = (br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson) o;
        return key == DTOPerson.key && Objects.equals(fistName, DTOPerson.fistName) && Objects.equals(address, DTOPerson.address) && Objects.equals(gender, DTOPerson.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, fistName, address, gender);
    }
}
