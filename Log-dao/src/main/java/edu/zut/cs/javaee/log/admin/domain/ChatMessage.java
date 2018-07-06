package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

/**
 * 
 * @author gongmin 用于建表的实体类
 */
// 数据库映射的表名
@Table(name = "T_CHATMESSAGE")
// 这是一个实体bean
@Entity
// 定义多个命名查询
@NamedQueries({@NamedQuery(name="ChatMessage.getRoot",query="select c from ChatMessage c where c.parent is null")})
public class ChatMessage extends BaseTreeEntity<ChatMessage>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	// 对应表中的列名
	@Column(name = "CHATMESSAGE")
	private String chatmessage;
	@Column(name = "DATE")
	private String date;
	@Column(name = "SPOKESMAN")
	private String spokesman;
	
//	public String getChatMessage() {
//		return chatmessage;
//	}
//	public void setChatMessage(String chatmessage) {
//		this.chatmessage = chatmessage;
//	}
	
	
	public String getChatmessage() {
		return chatmessage;
	}
	public void setChatmessage(String chatmessage) {
		this.chatmessage = chatmessage;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpokesman() {
		return spokesman;
	}
	public void setSpokesman(String spokesman) {
		this.spokesman = spokesman;
	}
}