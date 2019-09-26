package JDBC;

import java.util.ArrayList;

public interface EmpDaoWithPrepared {
    boolean insert(Employee emp);

    boolean delete(int id);

    boolean update(int id, Float newsalary);

    ArrayList<Employee> getAllRecords();

    boolean search(int id);


}
