package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseEntity;

@Table(name = "T_MESSAGE")
@Entity
public class Message extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "COMMENTER")
	private String commenter;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
}
