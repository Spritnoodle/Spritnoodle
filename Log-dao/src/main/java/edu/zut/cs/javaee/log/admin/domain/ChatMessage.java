package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

@Table(name = "T_CHATMESSAGE")
@Entity
@NamedQueries({@NamedQuery(name="ChatMessage.getRoot",query="select c from ChatMessage c where c.parent is null")})
public class ChatMessage extends BaseTreeEntity<ChatMessage>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	
	@Column(name = "CHATMESSAGE")
	private String chatmessage;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "SPOKESMAN")
	private String spokesman;
	
	public String getChatMessage() {
		return chatmessage;
	}
	public void setChatMessage(String chatmessage) {
		this.chatmessage = chatmessage;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSpokesman() {
		return spokesman;
	}
	public void setSpokesman(String spokesman) {
		this.spokesman = spokesman;
	}
}