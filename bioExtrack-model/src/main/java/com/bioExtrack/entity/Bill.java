package com.bioExtrack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    private OffsetDateTime date;

    private String billTypeDescription;

    private BigDecimal depositAmount;


}
