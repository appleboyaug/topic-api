package com.topic.fj.api.dao;

import com.topic.fj.api.model.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by appleboyaug on 16/2/29.
 */
@Repository(value = "testDao")
public interface TestDao {

    int insert(@Param("tid") String tid, @Param("tname") String tname);

    List<Test> findAll();

    Test findById(@Param("tid") String tid);
}
