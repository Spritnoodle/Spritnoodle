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

@Table(name = "T_STATISTICS")
@Entity
@NamedQueries({@NamedQuery(name="Statistics.getRoot",query="select m from Statistics m where m.parent is null")})
public class Statistics extends BaseTreeEntity<Statistics>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 236343542380911251L;
	/**
	 * 
	 */
	
	@Column(name = "STATISTICS")
	private String statistics;
	@Column(name = "UID")
	private String uid;
	
	@Column(name = "TAG")
	private String tag;
	@Column(name = "COUNT")
	private String count;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	
}
