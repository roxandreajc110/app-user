package com.valid.app.user.domain;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.valid.app.user.util.Constants;

public class ListUserDTO {
	
	@Valid
	@NotNull(message = "Lista de usuarios "+Constants.MSN_VALID_NULL)
	private List<UserDTO> listUserDto;

	public List<UserDTO> getListUserDto() {
		return listUserDto;
	}

	public void setListUserDto(List<UserDTO> listUserDto) {
		this.listUserDto = listUserDto;
	}
}
