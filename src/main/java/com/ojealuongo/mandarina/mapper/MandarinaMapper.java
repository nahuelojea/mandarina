package com.ojealuongo.mandarina.mapper;

import com.ojealuongo.mandarina.entity.Mandarina;
import com.ojealuongo.mandarina.openapi.dto.MandarinaDTO;
import org.mapstruct.Mapper;

@Mapper
public interface MandarinaMapper {

    Mandarina toMandarina(MandarinaDTO mandarinaDTO);

}
