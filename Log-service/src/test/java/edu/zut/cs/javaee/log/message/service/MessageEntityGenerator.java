package edu.zut.cs.javaee.log.message.service;

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
import edu.zut.cs.javaee.log.admin.service.MessageManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;

public class MessageEntityGenerator extends GenericGenerator{
	
	List<Message> messageList;
	
	MessageManager messageManager;
	
	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager=messageManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.messageList=new ArrayList<Message>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_message.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			Message m=new Message();
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
						m.setAuthor(value);
					if(j==5) {
						m.setCommenter(value);
					}
				}
			}
			this.messageList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.messageManager.save(this.messageList);
		List<Message> result=this.messageManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
