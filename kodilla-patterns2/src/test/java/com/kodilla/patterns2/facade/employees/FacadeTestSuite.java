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
    Company zzzyyy = new Company("zzzyyy");

    Employee ab = new Employee("aa", "bbb");
    Employee cd = new Employee("cc", "ddd");
    Employee ef = new Employee("ee", "fff");
    Employee gg = new Employee("gg", "ggg");
    Employee ggaa = new Employee("aa", "ggar");
    Employee ggz = new Employee("gg", "zzz");


    @Before
    public void given() {
        xxx.getEmployees().add(ab);
        xxx.getEmployees().add(cd);
        yyy.getEmployees().add(ef);
        xxx.getEmployees().add(gg);
        xxx.getEmployees().add(ggaa);
        yyy.getEmployees().add(ggz);
        zzzyyy.getEmployees().add(ab);

        ab.getCompanies().add(xxx);
        ab.getCompanies().add(zzzyyy);
        cd.getCompanies().add(xxx);
        ef.getCompanies().add(yyy);
        gg.getCompanies().add(xxx);
        ggaa.getCompanies().add(xxx);
        ggz.getCompanies().add(yyy);

        companyDao.save(xxx);
        companyDao.save(yyy);

        employeeDao.save(ab);
        employeeDao.save(cd);
        employeeDao.save(ef);
        employeeDao.save(gg);
        employeeDao.save(ggz);
        employeeDao.save(ggaa);


    }

    @Test
    public void testEmployee(){
    //given
    //when
        int result=searchFacade.processSearchEmployee("gg").size();
    //then
        Assert.assertEquals(3,result);
    }

    @Test
    public void testCompany(){
        //given
        //when
        int result=searchFacade.processSearchCompany("qq").size();
        //then
        Assert.assertEquals(0,result);
    }

    @Test
    public void testCompany2(){
        //given
        //when
        int result=searchFacade.processSearchCompany("yy").size();
        //then
        Assert.assertEquals(2,result);
    }

   @After
    public void cleanUp(){
        companyDao.delete(xxx);
        companyDao.delete(yyy);
        companyDao.delete(zzzyyy);
        employeeDao.delete(ab);
        employeeDao.delete(cd);
        employeeDao.delete(ef);
        employeeDao.delete(gg);
        employeeDao.delete(ggaa);
        employeeDao.delete(ggz);
    }

}
