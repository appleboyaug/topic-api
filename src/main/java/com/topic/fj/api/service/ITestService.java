package com.topic.fj.api.service;

import com.topic.fj.api.model.Test;

import java.util.List;

/**
 * Created by appleboyaug on 16/3/1.
 */
public interface ITestService {
    public void insert(String tid, String tname);
    public List<Test> findAll();
    public Test findById(String tid);
}
