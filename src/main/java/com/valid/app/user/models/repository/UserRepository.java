package com.valid.app.user.models.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.valid.app.user.models.entity.User;

/**
 * Interface DAO extends of CrudRepository
 * 
 * @author Roxana Andrea Jaramillo Cobos
 */

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Modifying
	@Query("UPDATE User U SET U.isProcessed = TRUE , U.processingDate =:date  WHERE U.id IN (:idUsers)")
	Integer updateProcessedUsers(@Param("idUsers") List<Integer> idUsers, @Param("date") Date date);

}