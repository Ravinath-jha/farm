package com.farm.backend.models;

import lombok.Data;

import java.util.Date;

@Data
public class ToolsRQ {
    private String toolName;
    private Double price;
    private Date purchaseDate;
    private String toolType;
}
