package edu.zut.cs.javaee.log.teaminformation.service;

import java.io.InputStream;
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

import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.admin.domain.TeamInformation;
import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;
import edu.zut.cs.javaee.log.admin.service.TeamInformationManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;

/**
 * 
 * @author heads43
 * 
 * 将xlsx表格中的内容导入到数据库中
 */

public class TeamInformationEntityGenerator extends GenericGenerator{
List<TeamInformation> teaminformationList;
	
	TeamInformationManager teaminformationManager;
	
	@Autowired
	public void setTeamInformationManager(TeamInformationManager teaminformationManager) {
		this.teaminformationManager=teaminformationManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.teaminformationList=new ArrayList<TeamInformation>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_teaminformation.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			TeamInformation m=new TeamInformation();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setTid(value);
					if(j==2) {
						m.settName(value);
					}
				}
			}
			this.teaminformationList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.teaminformationManager.save(this.teaminformationList);
		List<TeamInformation> result=this.teaminformationManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}

}
