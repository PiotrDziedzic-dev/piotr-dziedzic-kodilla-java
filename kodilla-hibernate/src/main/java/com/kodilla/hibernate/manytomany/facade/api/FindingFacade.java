package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FindingFacade {

    private static final Logger LOGGER = new LoggerFactory.getLogger(FindingFacade.class);
    private final FindingService findingService;

    @Autowired
    public FindingFacade(FindingService findingService) {
        this.findingService=findingService;
    }

    public List<Company> findCompany(String company) {
        LOGGER.info("Finding certain Company");
        return findingService.findCompany(company);
    }
    public List<Employee> findingEmployee(String name) {
        LOGGER.info("Finding certain employee");
        return findingService.findingEmployee(name);
    }

}
