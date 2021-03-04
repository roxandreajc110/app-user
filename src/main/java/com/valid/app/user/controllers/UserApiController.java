package com.valid.app.user.controllers;

import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.valid.app.user.domain.ListUserDTO;
import com.valid.app.user.domain.UserDTO;
import com.valid.app.user.service.IUserService;
import com.valid.app.user.util.Constants;

/**
 * Controller REST User
 *
 * @author Roxana Andrea Jaramillo Cobos
 */

@RestController
public class UserApiController implements IUserApi {

	@Autowired
	private IUserService userService;

	public ResponseEntity<Object> createUser(UserDTO userDto) {
		UserDTO newUser = userService.createUser(userDto);
		if (newUser != null) {
			return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(new JSONObject().put("message", Constants.MSN_ERROR_CREATED_USER).toMap(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Object> getAllUsers() {
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> updateProcessedUsers(ListUserDTO listUserDTO) {
		return new ResponseEntity<>(new JSONObject().put("message",
				userService.updateProcessedUsers(
						listUserDTO.getListUserDto().stream().map(user -> user.getId()).collect(Collectors.toList()))
						+ " usuarios procesados.")
				.toMap(), HttpStatus.OK);
	}
}
