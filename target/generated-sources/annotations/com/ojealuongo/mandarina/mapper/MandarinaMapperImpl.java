package com.ojealuongo.mandarina.mapper;

import com.ojealuongo.mandarina.entity.Mandarina;
import com.ojealuongo.mandarina.openapi.dto.MandarinaDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-01T14:23:26-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class MandarinaMapperImpl implements MandarinaMapper {

    @Override
    public Mandarina toMandarina(MandarinaDTO mandarinaDTO) {
        if ( mandarinaDTO == null ) {
            return null;
        }

        Mandarina mandarina = new Mandarina();

        return mandarina;
    }
}
