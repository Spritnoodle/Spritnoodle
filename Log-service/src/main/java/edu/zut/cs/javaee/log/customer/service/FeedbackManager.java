package edu.zut.cs.javaee.log.customer.service;

import java.util.List;

import edu.zut.cs.javaee.log.base.service.GenericManager;
import edu.zut.cs.javaee.log.customer.domain.FeedBack;

public interface FeedbackManager extends GenericManager<FeedBack, Long> {


    List<FeedBack> findByCustomer(String customerId);
}
