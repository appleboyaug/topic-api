package com.topic.fj.api.service.impl;

import com.topic.fj.api.dao.TestDao;
import com.topic.fj.api.model.Test;
import com.topic.fj.api.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by appleboyaug on 16/3/1.
 */
@Service(value = "testService")
public class TestService implements ITestService {
    @Resource(name = "testDao")
    private TestDao testDao;
    public void insert(String tid, String tname) {
        int success = testDao.insert(tid, tname);
        if (success > 0) {
            System.out.println("Test(tid=" + tid + ") inssert success");
        }
    }

    public List<Test> findAll() {
        return testDao.findAll();
    }

    public Test findById(String tid) {
        return testDao.findById(tid);
    }
}
