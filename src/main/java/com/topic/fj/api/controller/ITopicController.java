package com.topic.fj.api.controller;

import com.topic.fj.api.model.Response;
import com.topic.fj.api.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by appleboyaug on 16/2/28.
 */

@RequestMapping("/topic")
public interface ITopicController {

    @ResponseBody
    @RequestMapping("/v1/list")
    Response<List<Topic>> fetchTopics();
}
