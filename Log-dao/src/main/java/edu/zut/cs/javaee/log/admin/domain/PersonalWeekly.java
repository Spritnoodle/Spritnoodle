package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

//数据库映射的表名
@Table(name = "T_PersonalWeekly")
//这是一个实体的bean对象
@Entity
//定义多个查询
@NamedQueries({@NamedQuery(name="PersonalWeekly.getRoot",query="select p from PersonalWeekly p where p.parent is null")})
public class PersonalWeekly extends BaseTreeEntity<PersonalWeekly>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	
	//对应数据库中的列名
	@Column(name="PERSONALWEEKLY")
	private String personalWeekly;
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "DATE")
	private String date;
	@Column(name = "UID")
	private String uid;
	public String getPersonalWeekly() {
		return personalWeekly;
	}
	public void setPersonalWeekly(String personalWeekly) {
		this.personalWeekly = personalWeekly;
	}
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name = "UNAME")
	private String uname;
	
}

