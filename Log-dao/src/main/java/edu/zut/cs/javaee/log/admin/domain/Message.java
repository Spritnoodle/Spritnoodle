package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

/**
 * 
 * @author yifei 用于建表的实体类
 */
// 数据库映射的表名
@Table(name = "T_MESSAGE")
// 这是一个实体bean
@Entity
// 定义多个命名查询
@NamedQueries({ @NamedQuery(name = "Message.getRoot", query = "select m from Message m where m.parent is null") })
public class Message extends BaseTreeEntity<Message> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	// 对应表中的列名
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "DATE")
	private String date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
