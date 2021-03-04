package com.valid.app.user.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

/**
 * Business entity User.
 * 
 * @author Roxana Andrea Jaramillo Cobos
 */
@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name = "ID", nullable = false, length = 20)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Id User", name = "id", dataType = "Integer", example = "strategy = GenerationType.IDENTITY")
	private Integer id;
	
	@Column(name = "NAME", nullable = false, length = 20)
	@ApiModelProperty(value = "User name", name = "name", dataType = "String")
	private String name;
	
	@Column(name = "SURNAME", nullable = false, length = 20)
	@ApiModelProperty(value = "User surname", name = "surname", dataType = "String")
	private String surname;
	
	@Column(name = "IS_PROCESSED", nullable = false)
	@ApiModelProperty(value = "Indicates whether the record is processed or not", name = "isProcessed", dataType = "Boolean")
	private Boolean isProcessed;
	
	@Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone="COT")
	@ApiModelProperty(value = "User creation date", name = "creationDate", dataType = "Date", example = "02-03-2021")
	private Date creationDate;
	
	@Column(name = "PROCESSING_DATE", nullable = true, insertable = true, updatable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone="COT")
	@ApiModelProperty(value = "User processing date", name = "processingDate", dataType = "Date", example = "02-03-2021")
	private Date processingDate;
	
	public User() {
		this.isProcessed = false;
		this.creationDate = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Boolean getIsProcessed() {
		return isProcessed;
	}

	public void setIsProcessed(Boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}
}
