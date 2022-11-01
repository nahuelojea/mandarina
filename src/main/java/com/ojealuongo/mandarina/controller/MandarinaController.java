package com.ojealuongo.mandarina.controller;

import com.ojealuongo.mandarina.openapi.api.MandarinaApi;
import com.ojealuongo.mandarina.openapi.dto.MandarinaDTO;
import com.ojealuongo.mandarina.service.MandarinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MandarinaController implements MandarinaApi {

    private final MandarinaService mandarinaService;

    @Override
    public ResponseEntity<MandarinaDTO> createMandarina(MandarinaDTO mandarinaDTO) {
        mandarinaService.save(mandarinaDTO);
        return MandarinaApi.super.createMandarina(mandarinaDTO);
    }
}
