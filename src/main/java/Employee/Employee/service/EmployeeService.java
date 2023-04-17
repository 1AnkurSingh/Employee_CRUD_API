package Employee.Employee.service;


import Employee.Employee.EmployeeApplication;
import Employee.Employee.dao.EmployeeRepository;
import Employee.Employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    // Add Single Employee
    public Employee addSingleEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Add List of Employee
    public List<Employee> addListOfEmp(List<Employee> employee){
        return employeeRepository.saveAll(employee);
    }

    // Get All Employee
    public List<Employee> getAllEmployee(Employee employee) {
        return employeeRepository.findAll();
    }

    // Get Emp by id
    public Employee getEmpById(int id){
        return employeeRepository.findById(id).get();
    }

    // Get Employee By name
    public Employee getEmoByName(String name){
        return employeeRepository.findByName(name);
    }

    // update Employee by give the id in json

    public Employee updateEmployeeByJsonId(Employee employee)
    {
        Employee employee1=employeeRepository.findById(employee.getId()).orElse(null);
        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        employee1.setMobileNumber(employee.getMobileNumber());
        employee1.setDepartment(employee.getDepartment());
        return employeeRepository.save(employee1);
    }


    // update the employee ive the id in api
    public Employee updateEmployeeByApiId(Employee employee , int id){
        Employee e1=employeeRepository.findById(id).get();
        e1.setName(employee.getName());
        e1.setAddress(e1.getAddress());
        e1.setMobileNumber(employee.getMobileNumber());
        e1.setDepartment(employee.getDepartment());
        return employeeRepository.save(e1);
    }

    // update employee by name
    public  Employee updateEmployeeByName(Employee employee, String name){
        Employee e2=employeeRepository.findByName(name);
        e2.setName(employee.getName());
        e2.setAddress(e2.getAddress());
        e2.setMobileNumber(employee.getMobileNumber());
        e2.setDepartment(employee.getDepartment());
        return employeeRepository.save(e2);
    }

    // delete emp by id

    public String deleteEmp(int id){
        employeeRepository.deleteById(id);
        return "Deleted Successfully!!"+id;
    }

    // delete emp by Name
    // not working
    public String deleteEmpByName(String name){
        employeeRepository.deleteByName(name);
        return "Deleted Successfully!!"+name;
    }

    public String deleteAllEmp(){
        employeeRepository.deleteAll();
        return "All Employee Record Deleted Successfully !!";
    }



}
