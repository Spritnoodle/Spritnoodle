package edu.zut.cs.javaee.log.statistics.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.Statistics;
import edu.zut.cs.javaee.log.admin.service.StatisticsManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;

/**
 * @author G0die
 */

@Controller
@RequestMapping("/statistics/statistics")
public class StatisticsController extends GenericController<Statistics, Long, StatisticsManager>{
	
	StatisticsManager statisticsManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/statistics/index";
		return result;
	}

	@Autowired
	public void setStatisticsManager(StatisticsManager statisticsManager) {
		this.statisticsManager = statisticsManager;
		this.manager = this.statisticsManager;
	}
}
