package edu.zut.cs.javaee.log.admin.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.ChatMessage;
import edu.zut.cs.javaee.log.admin.domain.Message;
import edu.zut.cs.javaee.log.admin.domain.ModuleManagement;
import edu.zut.cs.javaee.log.admin.domain.PersonalMessage;
import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.admin.domain.Statistics;
import edu.zut.cs.javaee.log.admin.domain.TeamInformation;
import edu.zut.cs.javaee.log.admin.service.GroupManager;
import edu.zut.cs.javaee.log.admin.service.RoleManager;
import edu.zut.cs.javaee.log.admin.service.UserManager;
import edu.zut.cs.javaee.log.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

	@Autowired
	GroupManager groupManager;

	@Autowired
	UserManager userManager;

	@Autowired
	RoleManager roleManager;
	
	@Autowired
	MessageManager messageManager;
	
	@Autowired
	PersonalWeeklyManager personalWeeklyManager;
	
	@Autowired
	ModuleManagementManager modulemanagementManager;
	
	@Autowired
	PersonalMessageManager personalmessageManager;
	
	@Autowired
	ChatMessageManager chatmessageManager;
	
	@Autowired
	TeamInformationManager teamInformationManager;
	
	@Autowired
	StatisticsManager statisticsManager;
	
	/*
	@Test
	public void gen_group() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_user(g);
			}
		}
	}

	public void gen_user(Group g) {
		for (int i = 0; i < 10; i++) {
			User u = new User();
			u.setUsername("username_" + i);
			u.setPassword("password_" + i);
			u.setGroup(g);
			this.userManager.save(u);
		}
	}
	*/
	@Test
	public void gen_message() {
		for (int i = 0; i < 10; i++) {
			Message m = new Message();
			m.setMessage("message_" + i);
			this.messageManager.save(m);
		}
	}
	
	@Test
	public void gen_personalWeekly() {
		for(int i=0;i<10;i++) {
			PersonalWeekly p=new PersonalWeekly();
			p.setPersonalWeekly("personalWeekly_"+i);
			this.personalWeeklyManager.save(p);
		}
	}
	
	@Test
	public void gen_personalmessage() {
		for (int i = 0; i < 10; i++) {
			PersonalMessage m = new PersonalMessage();
			m.setPersonalmessage("personalmessage_" + i);
			this.personalmessageManager.save(m);
		}
	}
	
	@Test
	public void gen_chatmessage() {
		for (int i = 0; i < 10; i++) {
			ChatMessage m = new ChatMessage();
			m.setChatMessage("chatmessage_" + i);
			this.chatmessageManager.save(m);
		}
	}
	
	@Test
	public void gen_teamInformation() {
		for (int i = 0; i < 10; i++) {
			TeamInformation m = new TeamInformation();
			m.setTeamInformation("teamInformation_" + i);
			this.teamInformationManager.save(m);
		}
	}
	
	@Test
	public void gen_module() {
		for (int i = 0; i < 10; i++) {
			ModuleManagement m = new ModuleManagement();
			m.setGroup1("sprintnoodle");
			this.modulemanagementManager.save(m);
		}
	}
	
	
	@Test
	public void gen_statistics() {
		for (int i = 0; i < 10; i++) {
			Statistics m = new Statistics();
			m.setStatistics("statistics_" + i);
			this.statisticsManager.save(m);
		}
	}
}
