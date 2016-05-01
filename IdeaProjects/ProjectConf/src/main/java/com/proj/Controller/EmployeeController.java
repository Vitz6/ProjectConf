package com.proj.Controller;

import com.proj.Dao.EmployeeDao;
import com.proj.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wincenty on 4/22/2016.
 */
@ComponentScan
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

   // @RequestMapping(value = "/employees", method = RequestMethod.GET)
   // public List<Employee> getEmployees() {
    //    return employeeDao.findAllEmployees();
    //}

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployeesByAge() {
        return employeeDao.findByAge(20);
    }


}
