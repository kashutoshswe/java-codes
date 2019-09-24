package JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDaoImpl implements EmpDao {

    @Override
    public boolean insert(Employee emp) {
        Connection con = DBConnection.getConnection();
        Statement st = null;
        try {
            st = con.createStatement();
            String query = "insert into emp values(" + emp.getId() + ",'" + emp.getName() + "'," + emp.getSalary() + ")";
            int rec = st.executeUpdate(query);
            if (rec == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return false;
    }


    @Override
    public boolean delete(int id) {
        Connection con = DBConnection.getConnection();
        if (!(search(id)))
            return false;

        try {
            Statement st = con.createStatement();
            String Query = "delete from emp where id=" + id;

            int rec = st.executeUpdate(Query);
            if (rec == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean update(int id, Float newsalary) {
        Connection con = DBConnection.getConnection();
        if (!(search(id)))
            return false;

        try {
            Statement st = con.createStatement();
            String query = "Update emp set salary=" + newsalary + " where id=" + id;


            int rec = st.executeUpdate(query);
            if (rec == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return false;
    }


    @Override
    public ArrayList<Employee> getAllRecords() {

        ArrayList<Employee> arrayList = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        try {
            Statement st = con.createStatement();
            String query = "Select * from emp";
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            String name = "";
            Float salary;

            while (rs.next()) {
                id = rs.getInt(1);
                name = rs.getString(2);
                salary = rs.getFloat(3);
                Employee emp = new Employee(id, name, salary);
                arrayList.add(emp);
            }

            assert arrayList!=null || arrayList.isEmpty() : " Array List Object Not created ";

            if (arrayList.size() > 0)
            {
                return arrayList;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public boolean search(int id) {
        Connection con = DBConnection.getConnection();
        try {
            Statement st = con.createStatement();
            String Query = "select name from emp where id=" + id;
            ResultSet rec = st.executeQuery(Query);
            //ResultSet's object is created no matter the record is created or not

            if (rec.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}
