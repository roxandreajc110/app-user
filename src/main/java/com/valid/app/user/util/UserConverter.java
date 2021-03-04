package com.valid.app.user.util;

import com.valid.app.user.domain.UserDTO;
import com.valid.app.user.models.entity.User;

public class UserConverter extends Converter<User, UserDTO> {

	@Override
	public User fromDto(UserDTO dto) {
		User user = new User();
		user.setId(dto.getId());
		user.setName(dto.getName());
		user.setSurname(dto.getSurname());
		if(dto.getIsProcessed() != null) {
			user.setIsProcessed(dto.getIsProcessed());
		}
		return user;
	}

	@Override
	public UserDTO fromEntity(User entity) {
		UserDTO userDto = new UserDTO();
		userDto.setId(entity.getId());
		userDto.setName(entity.getName());
		userDto.setSurname(entity.getSurname());
		userDto.setIsProcessed(entity.getIsProcessed());
		return userDto;
	}

}
