package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    Employee davidSmith = new Employee("David", "Smith");
    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company greenGarden = new Company("Green Garden");
    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");

    @Test
    void testSaveManyToMany() {
        //Given
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
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findEmployeeByLastname() {
        //Given
        employeeDao.save(davidSmith);
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        int davidSmithId = davidSmith.getId();
        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaKovalskyId = lindaKovalsky.getId();

        //When
        List<Employee> employeeListNull = employeeDao.findEmployeeByLastname(null);
        List<Employee> employeeListBlack = employeeDao.findEmployeeByLastname("Black");
        List<Employee> employeeListSmith = employeeDao.findEmployeeByLastname("Smith");

        //Then
        assertTrue(employeeListNull.isEmpty());
        assertTrue(employeeListBlack.isEmpty());
        assertEquals(2, employeeListSmith.size());

        //CleanUp
        employeeDao.deleteById(davidSmithId);
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(lindaKovalskyId);
    }

    @Test
    public void findCompanyByPrefix() {
        //Given
        companyDao.save(greenGarden);
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        int greenGardenId = greenGarden.getId();
        int softwareMachineId = softwareMachine.getId();
        int dataMaestersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> companyListPrefixNull = companyDao.findCompanyByFirstThreeSigns(null);
        List<Company> companyListPrefixShorterThanThree = companyDao.findCompanyByFirstThreeSigns("a");
        List<Company> companyListPrefixLongerThanThree = companyDao.findCompanyByFirstThreeSigns("abcd");
        List<Company> companyListPrefixGre = companyDao.findCompanyByFirstThreeSigns("Gre");

        //Then
        assertTrue(companyListPrefixNull.isEmpty());
        assertTrue(companyListPrefixShorterThanThree.isEmpty());
        assertTrue(companyListPrefixLongerThanThree.isEmpty());
        assertEquals(2, companyListPrefixGre.size());

        //CleanUp
        companyDao.deleteById(greenGardenId);
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
    }
}