package edu.zut.cs.javaee.log.teach.service;

import java.util.List;

import edu.zut.cs.javaee.log.base.service.GenericManager;
import edu.zut.cs.javaee.log.teach.domain.Student;
/**
 * 
 * @author yifei
 *
 */
public interface StudentManager extends GenericManager<Student, Long> {

	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Student> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Student> findByFullname(String fullname);
}
