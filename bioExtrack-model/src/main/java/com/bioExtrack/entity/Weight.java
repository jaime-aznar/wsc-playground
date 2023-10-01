package com.bioExtrack.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Document(collection = "Weights")
public class Weight {
    private BigDecimal weight;

    private LocalDate date;
}
