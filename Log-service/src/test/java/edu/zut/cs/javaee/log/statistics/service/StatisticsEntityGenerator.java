package edu.zut.cs.javaee.log.statistics.service;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.Statistics;
import edu.zut.cs.javaee.log.admin.service.StatisticsManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;

/**
 * @author G0die
 * 将xlsx表格中的内容导入到数据库中
 */

public class StatisticsEntityGenerator extends GenericGenerator{
	
	List<Statistics> statisticsList;
	
	StatisticsManager statisticsManager;
	
	@Autowired
	public void setMessageManager(StatisticsManager statisticsManager) {
		this.statisticsManager=statisticsManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.statisticsList=new ArrayList<Statistics>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_statistics.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			Statistics m=new Statistics();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setStatistics(value);
					if(j==2)
						m.setUid(value);
					if(j==3)
						m.setTag(value);
					if(j==4) {
						m.setCount(value);
					}
				}
			}
			this.statisticsList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.statisticsManager.save(this.statisticsList);
		List<Statistics> result=this.statisticsManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
