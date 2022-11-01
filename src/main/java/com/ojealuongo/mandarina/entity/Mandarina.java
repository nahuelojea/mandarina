package com.ojealuongo.mandarina.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@Document(collection = "mandarinas")
public class Mandarina {

    @Id
    private UUID id;
    private String name;
}
