package JDBC;

public class Employee {

    public Employee() {
        super();
    }

    public Employee(int id, String name, Float salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    private String name;
    private Float salary;

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
