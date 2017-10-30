package com.kodilla.patterns2.facade.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SearchFacade {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public Set<Company> processSearchCompany(String searched) {
        Set<Company> result = companyDao.retrieveName("%" + searched + "%");
        if (result.size() > 0) {
            LOGGER.info("companies by name: ");
            for (Company c : result) {
                LOGGER.info(c.getName());
            }
        } else {
            LOGGER.info("didn't find: " + searched);
        }
        return result;
    }

    public Set<Employee> processSearchEmployee(String searched) {
        Set<Employee> resultName = employeeDao.retrieveName("%" + searched + "%");
        Set<Employee> resultSurname = employeeDao.retrieveSurname("%" + searched + "%");

        if (resultName.size()>0) {
            LOGGER.info("employees by name: ");
            for (Employee e : resultName) {
                LOGGER.info(e.getName() + " " + e.getSurname());
            }
        }
        else if(resultSurname.size()>0) {
            LOGGER.info("employees by surname: ");
            for (Employee e : resultSurname) {
                LOGGER.info(e.getName() + " " + e.getSurname());
            }
        }
        else LOGGER.info("didn't find: " + searched);

        for (Employee r: resultName){
            resultSurname.add(r);
        }
        return resultSurname;
    }
}
