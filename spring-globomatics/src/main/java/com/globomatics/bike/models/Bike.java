package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bike {
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;
	private Date purchaseDate;
	private boolean contact;
}
