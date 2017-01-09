package com.sh.academy.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/")
	public String home(){
		return "Hello Topic I'll provide you the API Documentation, If I want to ;-)";
	}
	
	@RequestMapping(value="/topics", method = RequestMethod.GET )
	public List<Topic> getAllTopics(){
		 return topicService.getAllTopics(); 
	}

	@RequestMapping(value="/topics/{id}" ,method = RequestMethod.GET)
	public Topic getTopicById(@PathVariable String id){
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(value="/topics", method = RequestMethod.POST)
	public void createTopic(@RequestBody Topic topic){
		topicService.createTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(value ="/topics/{id}", method =RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
}
