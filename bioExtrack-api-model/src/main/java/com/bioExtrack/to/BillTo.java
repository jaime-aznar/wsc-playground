package com.bioExtrack.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillTo {
    private OffsetDateTime date;

    private String billTypeDescription;

    private BigDecimal depositAmount;


}
