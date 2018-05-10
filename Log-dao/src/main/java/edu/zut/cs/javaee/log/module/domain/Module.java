package edu.zut.cs.javaee.log.module.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.log.base.domain.BaseTreeEntity;
import edu.zut.cs.javaee.log.module.domain.Module;

@Entity
@Table(name = "T_MODULE")
@NamedQueries({ @NamedQuery(name = "Module.getRoot", query = "select m from Module m where m.parent is null") })
public class Module extends BaseTreeEntity<Module> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1945866957570000331L;

	String description;

	String name;

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

}
