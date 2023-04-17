package Employee.Employee.controller;

import Employee.Employee.model.Employee;
import Employee.Employee.service.EmployeeService;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // Add Single Employee
    @PostMapping("/addSingleEmp")
    public Employee addSingleEmployee(@RequestBody Employee employee){
        return employeeService.addSingleEmployee(employee);
    }

    // Add List of Employee
    @PostMapping("/addListemp")
    public List<Employee> addListOfEmp(@RequestBody List<Employee> employee){
        return employeeService.addListOfEmp(employee);
    }

    // Get All Employee
    @GetMapping("/getAllemp")
    public List<Employee> getAllEmployee(Employee employee){
        return employeeService.getAllEmployee(employee);
    }

    // get Employee By id
    @GetMapping("/getEmpById/{empid}")
    public Employee getEmpById(@PathVariable ("empid") int empid){
        return employeeService.getEmpById(empid);
    }

    // get Employee by name
    @GetMapping("/getEmpByName/{name}")
    public Employee getempByName(@PathVariable String name){
        return employeeService.getEmoByName(name);
    }

    // update Employee By name
    @PutMapping("/updateEmp")
    public Employee updateEmployeeByJsonId(@RequestBody Employee employee){
        return employeeService.updateEmployeeByJsonId(employee);
    }

    // update employee by id in api
    @PutMapping("/updateEmpBy/{id}")
    public Employee updateEmployeeByIdInApi(@RequestBody Employee employee,@PathVariable("id") int id){
        return employeeService.updateEmployeeByApiId(employee,id);
    }

    // update employee by name
    @PutMapping("/updateEmpByName/{name}")
    public Employee updateEmployeeByName(@RequestBody Employee employee,@PathVariable("name") String name){
        return employeeService.updateEmployeeByName(employee,name);
    }

    // Delete Emp  By Id

    @DeleteMapping("/deleteById/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmp(id);
    }

    // Delete Emp by name
    // not Working properly
    @DeleteMapping("/deleteByName/{name}")
    public String deleteEmployeeByName(@PathVariable("name") String name)
    {
        return employeeService.deleteEmpByName(name);
    }

    // Delete All Employee
    @DeleteMapping("/delteAll")
    public String deleteAllEmp(){
        return employeeService.deleteAllEmp();

    }




}
