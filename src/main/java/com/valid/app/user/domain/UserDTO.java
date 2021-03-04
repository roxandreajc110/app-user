package com.valid.app.user.domain;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.valid.app.user.util.Constants;
import com.valid.app.user.util.Validation;

import io.swagger.annotations.ApiModelProperty;

public class UserDTO {

	@Id
	@ApiModelProperty(value = "Id User", name = "id", dataType = "Integer")
	@NotNull(groups = Validation.UserUpdateProcessed.class, message = "Id del usuario " + Constants.MSN_VALID_NULL)
	private Integer id;

	@ApiModelProperty(value = "User name", name = "name", dataType = "String")
	@NotNull(groups = Validation.UserInsert.class, message = "Nombre " + Constants.MSN_VALID_NULL)
	@NotEmpty(groups = Validation.UserInsert.class, message = "Nombre " + Constants.MSN_VALID_EMPTYL)
	private String name;

	@ApiModelProperty(value = "User surname", name = "surname", dataType = "String")
	@NotNull(groups = Validation.UserInsert.class, message = "Apellido " + Constants.MSN_VALID_NULL)
	@NotEmpty(groups = Validation.UserInsert.class, message = "Apellido " + Constants.MSN_VALID_EMPTYL)
	private String surname;

	@ApiModelProperty(value = "Indicates whether the record is processed or not", name = "isProcessed", dataType = "Boolean")
	private Boolean isProcessed;

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
}
