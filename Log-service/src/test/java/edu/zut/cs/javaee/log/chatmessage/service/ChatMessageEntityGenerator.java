package edu.zut.cs.javaee.log.chatmessage.service;

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

import edu.zut.cs.javaee.log.admin.domain.ChatMessage;
import edu.zut.cs.javaee.log.admin.service.ChatMessageManager;
import edu.zut.cs.javaee.log.admin.service.UserManagerTest;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;
/**
 * 
 * @author gongmin
 * 
 * 将xlsx表格中的内容导入到数据库中
 */
public class ChatMessageEntityGenerator extends GenericGenerator{
	
	List<ChatMessage> chatmessageList;
	
	ChatMessageManager chatmessageManager;
	
	@Autowired
	public void setChatMessageManager(ChatMessageManager chatmessageManager) {
		this.chatmessageManager=chatmessageManager;
	}
	
	@Before
	public void setUp() throws Exception{
		this.chatmessageList=new ArrayList<ChatMessage>();
		InputStream input=UserManagerTest.class.getResourceAsStream("/javaee_log_chatmessage.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			ChatMessage m=new ChatMessage();
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell!=null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j==1) 
						m.setChatmessage(value);
					if(j==2)
						m.setDate(value);
					if(j==3)
						m.setSpokesman(value);
				}
			}
			this.chatmessageList.add(m);
		}
	}
	
	@Test
	public void test() {
		this.chatmessageManager.save(this.chatmessageList);
		List<ChatMessage> result=this.chatmessageManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}
}
