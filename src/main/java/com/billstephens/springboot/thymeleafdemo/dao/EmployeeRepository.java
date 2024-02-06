package com.billstephens.springboot.thymeleafdemo.dao;

import com.billstephens.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    // note the name of the method is important as Spring Data JPA will parse the method name
    // and automatically create a SQL query based off of it.
    public List<Employee> findAllByOrderByLastNameAsc();

}
