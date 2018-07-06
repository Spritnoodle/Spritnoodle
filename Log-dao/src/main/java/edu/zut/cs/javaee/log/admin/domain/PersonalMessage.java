package edu.zut.cs.javaee.log.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;
/**
 * 
 * @author zhouhuiquan 用于建表的实体类
 */
// 数据库映射的表名
@Table(name = "T_Personal")
// 这是一个实体bean
@Entity
// 定义多个命名查询
@NamedQueries({@NamedQuery(name="PersonalMessage.getRoot",query="select p from PersonalMessage p where p.parent is null")})

public class PersonalMessage extends BaseTreeEntity<PersonalMessage> {
	/**
	 *
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	 	// 对应表中的列名
	@Column(name = "PERSONALMESSAGE")
	private String personalmessage;
	@Column(name = "GRADE")
	private String Grade;
	@Column(name = "NAME")
	private String Name;
	@Column(name = "CNO")
	private String Cno;
	@Column(name = "TASK")
	private String Task;
	public String getPersonalmessage() {
		return personalmessage;
	}
	public void setPersonalmessage(String personalmessage) {
		this.personalmessage = personalmessage;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
}
