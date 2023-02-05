package com.farm.backend.datatable;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tools")
public class ToolsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "tool_name")
    private String toolName;

    @Column(name = "price")
    private Double price;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "tool_type")
    private String toolType;

}
