package edu.depaul.cdm.se.demo.converters;

import edu.depaul.cdm.se.demo.Repositories.RoomTypeRepository;
import edu.depaul.cdm.se.demo.model.Room_Type;
import org.springframework.core.convert.converter.Converter;

public class RoomTypeConverter implements Converter<String, Room_Type> {

    private RoomTypeRepository rtrepo;

    @Override
    public Room_Type convert(String s) {
        long id = Long.valueOf(s);
        return this.rtrepo.findById(id);
    }
}
