package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchProcessorFacadeTest {

    @Autowired
    SearchProcessorFacade searchProcessorFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    void TestSearchCompanyByName() {
        //Given
        Company greenGarden = new Company("Green Garden");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(greenGarden);
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        int greenGardenId = greenGarden.getId();
        int softwareMachineId = softwareMachine.getId();
        int dataMaestersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> companyListNull = searchProcessorFacade.findCompanyByNameFragment(null);
        List<Company> companyListNoLetters = searchProcessorFacade.findCompanyByNameFragment("");
        List<Company> companyListPrefixLetters = searchProcessorFacade.findCompanyByNameFragment("gre");
        List<Company> companyListMiddleLetters = searchProcessorFacade.findCompanyByNameFragment("ma");

        //Then
        assertEquals(0, companyListNull.size());
        assertEquals(4, companyListNoLetters.size());
        assertEquals(2, companyListPrefixLetters.size());
        assertEquals(3, companyListMiddleLetters.size());

        //CleanUp
        companyDao.deleteById(greenGardenId);
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
    }

    @Test
    void TestSearchEmployeeByLastname() {
        //Given
        Employee davidSmith = new Employee("David", "Smith");
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(davidSmith);
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        int davidSmithId = davidSmith.getId();
        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaKovalskyId = lindaKovalsky.getId();

        //When
        List<Employee> employeeListNull = searchProcessorFacade.findEmployeeByLastname(null);
        List<Employee> employeeListNoLetters = searchProcessorFacade.findEmployeeByLastname("");
        List<Employee> employeeLListPrefixLetters = searchProcessorFacade.findEmployeeByLastname("Sm");
        List<Employee> employeeLListMiddleLetters = searchProcessorFacade.findEmployeeByLastname("a");

        //Then
        assertEquals(0, employeeListNull.size());
        assertEquals(4, employeeListNoLetters.size());
        assertEquals(2, employeeLListPrefixLetters.size());
        assertEquals(2, employeeLListMiddleLetters.size());

        //CleanUp
        employeeDao.deleteById(davidSmithId);
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(lindaKovalskyId);
    }
}