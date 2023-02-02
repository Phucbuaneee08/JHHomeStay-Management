package com.arjuncodes.JHHomeStayManagement.dtos;

import lombok.Data;

import java.util.Date;
@Data
public class CustomerDTO {
    private long id;
    private Date customerDOB;
    private String customerName;
    private String customerID;
    private String customerPhone;
}
