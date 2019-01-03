package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
//this is a stereotype annotation
//this marks the class as spring service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("Javascript", "Javascript", "Javascript Description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
//        using lambda expression. look it up
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (Topic t : topics) {
            if (t.getId().equals(id)) {
                topics.remove(t);
                topics.add(topic);

                return;
            }
        }
    }

    public void deleteTopic(String id) {
//        for (Topic t : topics) {
//            if (t.getId().equals(id)) {
//                topics.remove(t);
//
//                return;
//            }
//        }
//        using lambda expressions, look it up
        topics.removeIf(t -> t.getId().equals(id));
    }
}
