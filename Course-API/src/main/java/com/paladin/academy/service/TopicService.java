package com.paladin.academy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.paladin.academy.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java", "Java tutorial Course", "Java Topic Description"),
			new Topic("JavaScript", "JavaScript tutorial Course", "JavaScript Topic Description"),
			new Topic("Java Enterprise", "JavaEnterprise tutorial Course", "JavaEnterprise Topic Description")));

	public List<Topic> getAllTopics() {
		return topics;

	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}
	
	public void createTopic(Topic topic){
		topics.add(topic);
	}

	
	public void updateTopic(String id, Topic topic){
		Topic updateTopic = topics.stream().filter(t->t.getId().equalsIgnoreCase(id)).findFirst().get();
		updateTopic.setName(topic.getName());;
		updateTopic.setDescription(topic.getDescription());;
	}
	
	public void deleteTopic(String id){
		// to be implemented
	}
	

}
