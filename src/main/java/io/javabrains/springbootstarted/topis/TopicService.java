package io.javabrains.springbootstarted.topis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics;

	public List<Topic> getAllTopics()
	{
		topics=new ArrayList<>();
		Topic topic1=new Topic(1,"topic1");
		Topic topic2=new Topic(2,"topic2");
		Topic topic3=new Topic(3,"topic3");
		Topic topic4=new Topic(4,"topic4");

		topics.add(topic1);
		topics.add(topic2);
		topics.add(topic3);
		topics.add(topic4);

		return topics;
	}

	public Topic getTopicById(int id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
}