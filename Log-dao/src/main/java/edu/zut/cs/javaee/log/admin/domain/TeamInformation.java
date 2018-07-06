package edu.zut.cs.javaee.log.admin.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;

/**
 * 
 * @author heads43 用于建表的实体类
 */
// 数据库映射的表名
@Table(name = "T_TeamInformation")
// 这是一个实体bean
@Entity
// 定义多个命名查询
@NamedQueries({@NamedQuery(name="TeamInformation.getRoot",query="select m from TeamInformation m where m.parent is null")})
public class TeamInformation extends BaseTreeEntity<TeamInformation>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	// 对应表中的列名
	@Column(name = "TeamInformation")
	private String teamInformation;
	@Column(name = "TID")
	private String tid;
	@Column(name = "TUNAME")
	private String tName;
	public String getTeamInformation() {
		return teamInformation;
	}
	public void setTeamInformation(String teamInformation) {
		this.teamInformation = teamInformation;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
