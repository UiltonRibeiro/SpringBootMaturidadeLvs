package br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Mapper;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.DTO.DTOPerson;
import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.ArrayList;
import java.util.List;

public class MapperModel {

    private static ModelMapper mapper = new ModelMapper();

    static{
        mapper.addMappings(new PropertyMap<Person, DTOPerson>() {
            @Override
            protected void configure(){
                map().setKey(source.getId());
            }
        });
    }

    public static <O,D> D parseObjetc(O origin, Class<D> destination){
        return mapper.map(origin,destination);
    }

    public static <O,D> List<D> parseListObjects(List<O> origin, Class<D> destination){
        List<D> destinationObjetcs = new ArrayList<D>();
        for (O o: origin) {
            destinationObjetcs.add(mapper.map(o,destination));
        }
        return destinationObjetcs;
    }
}
