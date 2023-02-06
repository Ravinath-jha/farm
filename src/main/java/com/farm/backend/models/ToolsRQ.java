package com.farm.backend.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class ToolsRQ {
    private String toolName;
    private Double price;
    private Date purchaseDate;
    private String toolType;
}
