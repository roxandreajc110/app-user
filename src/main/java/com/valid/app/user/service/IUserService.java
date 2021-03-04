package com.valid.app.user.service;

import java.util.List;

import com.valid.app.user.domain.UserDTO;

/**
 * Interface User
 * 
 * @author Roxana Andrea Jaramillo Cobos
 */

public interface IUserService {
	
	UserDTO createUser(UserDTO userDto);

	List<UserDTO> getAllUsers();

	Integer updateProcessedUsers(List<Integer> idUsers);
	
}
