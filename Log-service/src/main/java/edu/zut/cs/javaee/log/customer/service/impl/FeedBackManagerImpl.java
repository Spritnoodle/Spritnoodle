package edu.zut.cs.javaee.log.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.log.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.log.customer.dao.FeedBackDao;
import edu.zut.cs.javaee.log.customer.domain.FeedBack;
import edu.zut.cs.javaee.log.customer.service.FeedbackManager;

@Component
public class FeedBackManagerImpl extends GenericManagerImpl<FeedBack, Long> implements FeedbackManager {

    FeedBackDao feedBackDao;

    @Override
    public List<FeedBack> findByCustomer(String customerId) {
        List<FeedBack> all = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            all.add(feedback);
        }
        return all;
    }

    @Autowired
    public void setFeedBackDao(FeedBackDao feedBackDao) {
        this.feedBackDao = feedBackDao;
        this.dao = this.feedBackDao;
    }

}

