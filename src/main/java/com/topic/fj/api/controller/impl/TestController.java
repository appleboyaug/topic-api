package com.topic.fj.api.controller.impl;

import com.topic.fj.api.model.Response;
import com.topic.fj.api.model.Test;
import com.topic.fj.api.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by appleboyaug on 16/3/1.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Resource(name = "testService")
    private ITestService testServic;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public Response<List<Test>> fetchTopics() {
        Response<List<Test>> response = new Response<List<Test>>();
        List<Test> arrayList = testServic.findAll();
        response.setData(arrayList);
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/find")
    public Response<Test> fetchTopic() {
        Response<Test> response = new Response<Test>();
        Test test = testServic.findById("1");
        response.setData(test);
        return response;
    }

    @RequestMapping(value = "/test1")
    public String test1() {
        return "home";
    }
}
