package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");


    @Test
    public void testSaveManyToMany(){
        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
//                try {
//                companyDao.delete(softwareMachineId);
//                companyDao.delete(dataMaestersId);
//                companyDao.delete(greyMatterId);
//            } catch (Exception e) {
//            }
        }
    @Test
    public void testNamedQuery(){
        //given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        //when
        List<Employee> byLastnameResult=employeeDao.retrieveEmployeeByLastname("Smith");
        //then
        Assert.assertTrue(byLastnameResult.size()>0);
        //cleanup
//        try{
//            employeeDao.delete(johnSmith);
//            employeeDao.delete(stephanieClarckson);
//            employeeDao.delete(lindaKovalsky);
//        }catch (Exception e){
//
//        }
    }
    @Test
    public void testNamedNativeQuery(){
        //given
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        //when
        List<Company> beginigWith=companyDao.retrieveCompaniesBeginigWith("Sof");
        //then
        Assert.assertTrue(beginigWith.size()>0);
        //cleanup
//        try{
//            companyDao.delete(softwareMachine);
//            companyDao.delete(dataMaesters);
//            companyDao.delete(greyMatter);
//        }catch (Exception e){
//
//        }
    }
    @After
    public void cleanUp(){
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
    }

}