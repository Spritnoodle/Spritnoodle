package edu.zut.cs.javaee.log.base.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import edu.zut.cs.javaee.log.base.domain.BaseEntity;

/**
 * Generic DAO (Data Access Object) with common methods to CRUD POJOs.
 * Implemented with Spring-Data-JPA Repository
 * <p>
 * Extend this interface if you want type safe (no casting necessary) DAO's for
 * your domain objects.
 * 
 * @author <a href="569482018@qq.com">yifei</a>
 * @param <T>
 *            a type variable, Entity
 * @param <PK>
 *            the primary key for that type，Entity Id
 */
@NoRepositoryBean
public interface GenericDao<T extends BaseEntity, PK extends Serializable>
		extends JpaRepository<T, PK>, JpaSpecificationExecutor<T> {
}
