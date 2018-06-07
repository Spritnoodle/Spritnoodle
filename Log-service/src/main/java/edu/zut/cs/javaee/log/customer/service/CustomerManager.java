package edu.zut.cs.javaee.log.customer.service;

import java.util.List;

import edu.zut.cs.javaee.log.base.service.GenericManager;
import edu.zut.cs.javaee.log.customer.domain.Customer;

public interface CustomerManager extends GenericManager<Customer, Long> {

    /**
     * 
     * @param fullname
     * @return
     */
	List<Customer> findByFullname(String fullname);

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<Customer> findByPostcode(String postcode);
}