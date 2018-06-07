package edu.zut.cs.javaee.log.customer.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.log.customer.domain.Customer;
import edu.zut.cs.javaee.log.customer.service.CustomerManager;

@Controller
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer, Long,CustomerManager> {

    CustomerManager customerManager;

    @Autowired
    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
        this.manager = this.customerManager;
    }

}

