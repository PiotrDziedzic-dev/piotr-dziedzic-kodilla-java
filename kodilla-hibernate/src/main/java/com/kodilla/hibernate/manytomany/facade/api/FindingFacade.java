package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FindingFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindingFacade.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Company> findCompany(String name) {
        LOGGER.info("aaa");
        return companyDao.retrieveCompaniesWitchHaveWord(name);


    }
    public List<Employee> findingEmployee(String name) {
        LOGGER.info("aaa");
        return employeeDao.retrieveEmployeesWhichHaveWord(name);

    }

}
