package com.valid.app.user.controllers;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valid.app.user.domain.ListUserDTO;
import com.valid.app.user.domain.UserDTO;
import com.valid.app.user.exception.ErrorInfo;
import com.valid.app.user.util.Validation;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * Enpoint REST User
 *
 * @author Roxana Andrea Jaramillo Cobos
 */

@CrossOrigin("*")
@RequestMapping("/api/user")
public interface IUserApi {

	
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "Service that a user creates")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message="User created successfully", response = UserDTO.class),
			@ApiResponse(code = 400, message="There was a problem with the user information", response = ErrorInfo.class),
			@ApiResponse(code = 500, message="There was a problem with the server", response = ErrorInfo.class)
	})
	ResponseEntity<Object> createUser(@Validated(Validation.UserInsert.class) @RequestBody UserDTO userDto);

	@GetMapping(value = "/", consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "Service that returns all users")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message="Successfully obtained users", response = ArrayList.class),
			@ApiResponse(code = 500, message="There was a problem with the server", response = ErrorInfo.class)
	})
	ResponseEntity<Object> getAllUsers();
	
	@PostMapping(value = "/updateProcessed", consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "Update processed field in true")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message="Successful update", response = String.class),
			@ApiResponse(code = 400, message="There was a problem with the user information", response = ErrorInfo.class),
			@ApiResponse(code = 500, message="There was a problem with the server", response = ErrorInfo.class)
	})
	ResponseEntity<Object> updateProcessedUsers(@Validated(Validation.UserUpdateProcessed.class) @RequestBody ListUserDTO listUserDTO);
}
