package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class EmpDaoImplWithPrepared implements EmpDaoWithPrepared {
    @Override
    public boolean insert(Employee emp) {
        Connection con = DBConnection.getConnection();
        String query = "insert into emp values(?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, emp.getId());
            pst.setString(2, emp.getName());
            pst.setFloat(3, emp.getSalary());
            int res = pst.executeUpdate();
            if (res == 1) {
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
        String query = "delete from emp where id=?";
        if (!(search(id)))
            return false;

        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int res = pst.executeUpdate();
            if (res == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
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
        String query = "update emp set salary =? where id=?";
        if (!(search(id)))
            return false;

        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setFloat(1, newsalary);
            int res = pst.executeUpdate();
            if (res == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
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
        Connection con = DBConnection.getConnection();
        try {
            String query = "Select * from emp";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);
            ArrayList<Employee> arrayList = new ArrayList<>();
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

            if (arrayList.size() > 0) {
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
            String query = "select name from emp where id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
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
