package practica;

public class Employee {
    private int id;
    private String name;
    private String lastname;
    private int salary;

    public Employee(int id, String name, String lastname, int salary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", salary=" + salary + "]";
    }
}

class Rta {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Doe", 5000);
        System.out.println(employee.toString());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println("New Salary after raise: " + employee.getSalary());
    }
}