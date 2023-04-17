package Employee.Employee.dao;

import Employee.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);



    Employee deleteEmployeeByName(String name);

    Employee deleteByName(String name);


}
