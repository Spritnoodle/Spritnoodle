package edu.zut.cs.javaee.log.feedback.service;

import java.util.List;

import edu.zut.cs.javaee.log.feedback.domain.FeedBack;

public interface FeedbackManager {


    List<FeedBack> findByCustomer(String customerId);
}
