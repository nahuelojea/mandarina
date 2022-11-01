package com.ojealuongo.mandarina.service.impl;

import com.ojealuongo.mandarina.mapper.MandarinaMapper;
import com.ojealuongo.mandarina.openapi.dto.MandarinaDTO;
import com.ojealuongo.mandarina.repository.MandarinaRepository;
import com.ojealuongo.mandarina.service.MandarinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MandarinaServiceImpl implements MandarinaService {

    private final MandarinaRepository mandarinaRepository;

    private final MandarinaMapper mandarinaMapper;

    @Override
    public void save(MandarinaDTO mandarinaDTO) {
        mandarinaDTO.setId(UUID.randomUUID().toString());
        mandarinaRepository.save(mandarinaMapper.toMandarina(mandarinaDTO));
    }
}
