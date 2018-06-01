package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.Statistics;
import edu.zut.cs.javaee.log.admin.service.StatisticsManager;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class StatisticsManagerTest extends GenericTreeManagerTestCase<Long,Statistics,StatisticsManager>{
	
	StatisticsManager statisticsManager;
	
	@Autowired
	public void setMessageManager(StatisticsManager statisticsManager) {
		this.statisticsManager = statisticsManager;
		this.manager=this.statisticsManager;
	}
	


	public StatisticsManagerTest() {
		super(Statistics.class);
		// TODO Auto-generated constructor stub
	}

}
