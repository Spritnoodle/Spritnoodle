package edu.zut.cs.javaee.log.personalmessage.service;

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
import edu.zut.cs.javaee.log.admin.domain.PersonalMessage;
import edu.zut.cs.javaee.log.admin.service.PersonalMessageManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;
/**
 * 
 * @author zhouhuiquan
 * 
 * 将xlsx表格中的内容导入到数据库中
 */
public class PersonalMessageEntityGenerator extends GenericGenerator{
	
	List<PersonalMessage> personalmessageList;
	
	PersonalMessageManager personalmessageManager;
	
	@Autowired
	public void setPersonalMessageManager(PersonalMessageManager personalmessageManager) {
		this.personalmessageManager=personalmessageManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.personalmessageList=new ArrayList<PersonalMessage>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_personalmessage.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			PersonalMessage m=new PersonalMessage();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setPersonalmessage(value);
					if(j==2)
						m.setGrade(value);
					if(j==3)
						m.setName(value);
					if(j==4)
						m.setCno(value);
					if(j==5){
						m.setTask(value);
					}
				}
			}
			this.personalmessageList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.personalmessageManager.save(this.personalmessageList);
		List<PersonalMessage> result=this.personalmessageManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
