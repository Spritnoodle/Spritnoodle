package edu.zut.cs.javaee.log.personalweekly.service;

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
import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;
/**
 * 
 * @author dell
 *将xlsx表格中的内容导入到数据库中
 */

public class PersonalWeekelyEntityGenerator extends GenericGenerator{
	
	List<PersonalWeekly> personalweeklyList;
	
	PersonalWeeklyManager personalweeklyManager;
	
	@Autowired
	public void setPersonalWeeklyManager(PersonalWeeklyManager personalweeklyManager) {
		this.personalweeklyManager=personalweeklyManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.personalweeklyList=new ArrayList<PersonalWeekly>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_personalweekly.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			PersonalWeekly m=new PersonalWeekly();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setMessage(value);
					if(j==2)
						m.setDate(value);
					if(j==3)
						m.setUname(value);
					if(j==5){
						m.setUid(value);
					}
				}
			}
			this.personalweeklyList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.personalweeklyManager.save(this.personalweeklyList);
		List<PersonalWeekly> result=this.personalweeklyManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
