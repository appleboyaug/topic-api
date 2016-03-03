package com.topic.fj.api.controller.impl;

import com.topic.fj.api.controller.ITopicController;
import com.topic.fj.api.model.Response;
import com.topic.fj.api.model.Topic;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by appleboyaug on 16/2/28.
 */
@Controller
public class TopicController implements ITopicController {

    public Response<List<Topic>> fetchTopics() {
        Response<List<Topic>> response = new Response<List<Topic>>();
        ArrayList<Topic> arrayList = new ArrayList<Topic>();
        for (int i = 0; i < 4; i++) {
            Topic topic = new Topic();
            topic.setTopicId("" + i);
            arrayList.add(topic);
        }
        response.setData(arrayList);
        return response;
    }
}
