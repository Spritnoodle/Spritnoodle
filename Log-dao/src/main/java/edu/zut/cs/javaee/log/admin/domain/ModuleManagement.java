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
@Table(name = "T_MODULEa")
//这是一个实体bean
@Entity
//定义多个命名查询
@NamedQueries({@NamedQuery(name="ModuleManagement.getRoot",query="select m from ModuleManagement m where m.parent is null")})
public class ModuleManagement extends BaseTreeEntity<ModuleManagement>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	
	@Column(name = "module1")
	private String module1;
	@Column(name = "name1")
	private String name1;
	@Column(name = "group1")
	private String group1;
	public String getModule1() {
		return module1;
	}
	public void setModule1(String module1) {
		this.module1 = module1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getGroup1() {
		return group1;
	}
	public void setGroup1(String group1) {
		this.group1 = group1;
	}

	
}
