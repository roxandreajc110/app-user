package com.valid.app.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.app.user.domain.UserDTO;
import com.valid.app.user.exception.UserException;
import com.valid.app.user.models.entity.User;
import com.valid.app.user.models.repository.UserRepository;
import com.valid.app.user.util.UserConverter;

/**
 * Interface Implementation User Service
 * 
 * @author Roxana Andrea Jaramillo Cobos
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO createUser(UserDTO userDto) {
		UserConverter userConverter = new UserConverter();
		User newUser = new User();
		try {
			newUser = userRepository.save(userConverter.fromDto(userDto));
			return userConverter.fromEntity(newUser);
		} catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}

	@Override
	public List<UserDTO> getAllUsers() {
		UserConverter userConverter = new UserConverter();
		Iterable<User> listUsers = new ArrayList<>();
		try {
			listUsers = userRepository.findAll();
			return userConverter.fromEntity(listUsers);
		} catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}

	@Transactional
	public Integer updateProcessedUsers(List<Integer> idUsers) {
		try {
			return userRepository.updateProcessedUsers(idUsers, new Date());
		} catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}
}
