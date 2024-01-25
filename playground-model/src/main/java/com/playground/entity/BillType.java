package com.playground.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BillType")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillType {
    private String billTypeCategory;
    private String billTypeDescription;
}
