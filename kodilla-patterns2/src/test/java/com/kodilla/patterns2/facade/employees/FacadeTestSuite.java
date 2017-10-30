package com.kodilla.patterns2.facade.employees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Marcin Muller on 25.10.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    SearchFacade searchFacade;


    Company xxx = new Company("xxx");
    Company yyy = new Company("yyy");

    Employee ab = new Employee("aa", "bbb");
    Employee cd = new Employee("cc", "ddd");
    Employee ef = new Employee("ee", "fff");
    Employee gg = new Employee("gg", "ggg");

    @Before
    public void given() {
        xxx.getEmployees().add(ab);
        xxx.getEmployees().add(cd);
        yyy.getEmployees().add(ef);
        xxx.getEmployees().add(gg);

        ab.getCompanies().add(xxx);
        cd.getCompanies().add(xxx);
        ef.getCompanies().add(yyy);
        gg.getCompanies().add(xxx);

        companyDao.save(xxx);
        companyDao.save(yyy);

        employeeDao.save(ab);
        employeeDao.save(cd);
        employeeDao.save(ef);
        employeeDao.save(gg);
    }

    @Test
    public void testEmployee(){
    //given
    //when
        int result=searchFacade.processSearchEmployee("gg").size();
    //then
        Assert.assertEquals(1,result);
    }

    @Test
    public void testCompany(){
        //given
        //when
        int result=searchFacade.processSearchCompany("qq").size();
        //then
        Assert.assertEquals(0,result);
    }

    @After
    public void cleanUp(){
        companyDao.delete(xxx);
        companyDao.delete(yyy);
        employeeDao.delete(ab);
        employeeDao.delete(cd);
        employeeDao.delete(ef);
        employeeDao.delete(gg);
    }

}
