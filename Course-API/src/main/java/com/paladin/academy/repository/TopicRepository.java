/**
 * 
 */
package com.paladin.academy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paladin.academy.model.Topic;

/**
 * @author SHavara1
 *
 */

public interface TopicRepository extends CrudRepository<Topic, String>{
	
	

}
