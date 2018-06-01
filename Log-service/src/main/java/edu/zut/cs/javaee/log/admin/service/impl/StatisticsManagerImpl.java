package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.StatisticsDao;
import edu.zut.cs.javaee.log.admin.domain.Statistics;
import edu.zut.cs.javaee.log.admin.service.StatisticsManager;
import edu.zut.cs.javaee.log.base.dao.GenericTreeDao;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;

@Service("statisticsManager")
@Transactional
public class StatisticsManagerImpl extends GenericTreeManagerImpl<Statistics,Long> implements StatisticsManager{
	
	StatisticsDao statisticsDao;

	@Autowired
	public void setStatisticsDao(StatisticsDao statisticsDao) {
		this.statisticsDao = statisticsDao;
		this.treeDao=(GenericTreeDao<Statistics, Long>) this.statisticsDao;
		this.dao=this.treeDao;
	}
	
	
}
