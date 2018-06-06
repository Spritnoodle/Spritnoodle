package edu.zut.cs.javaee.log.admin.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

@Table(name = "T_PersonalWeekly")
@Entity
@NamedQueries({@NamedQuery(name="PersonalWeekly.getRoot",query="select p from PersonalWeekly p where p.parent is null")})
public class PersonalWeekly extends BaseTreeEntity<PersonalWeekly>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	@Column(name="PERSONALWEEKLY")
	private String personalWeekly;
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "WDATE")
	private Date date;
	@Column(name = "UID")
	private String uid;
	@Column(name = "UNAME")
	private String uname;
	
	public String getPersonalWeekly() {
		return personalWeekly;
	}
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
	public void setPersonalWeekly(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}

