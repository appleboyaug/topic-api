package com.topic.fj.api.model;

import java.io.Serializable;

/**
 * Created by appleboyaug on 16/2/28.
 */
public class Topic implements Serializable {
    private String topicId;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicId='" + topicId + '\'' +
                '}';
    }
}
