package edu.zut.cs.javaee.log.modulemanagement.service;

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

import edu.zut.cs.javaee.log.admin.domain.Message;
import edu.zut.cs.javaee.log.admin.domain.ModuleManagement;
import edu.zut.cs.javaee.log.admin.service.MessageManager;
import edu.zut.cs.javaee.log.admin.service.ModuleManagementManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;

public class ModuleManagementEntityGenerator extends GenericGenerator{
	
	List<ModuleManagement> moduleManagementList;
	
	ModuleManagementManager moduleManagementManager;
	
	@Autowired
	public void setMessageManager(ModuleManagementManager moduleManagementManager) {
		this.moduleManagementManager=moduleManagementManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.moduleManagementList=new ArrayList<ModuleManagement>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_moduleManagement.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			ModuleManagement m=new ModuleManagement();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setName1(value);
					if(j==2)
						m.setGroup1(value);
					if(j==3)
						m.setModule1(value);
				}
			}
			this.moduleManagementList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.moduleManagementManager.save(this.moduleManagementList);
		List<ModuleManagement> result=this.moduleManagementManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
