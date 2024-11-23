import java.util.Objects;

public class Employee {
    private int id;
    private final String  fullName;
    private int department;
    private float salary;
    private static int count = 0;

    public Employee(String fullName, int department, float salary) {
        id = ++count;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department);
    }

    @Override
    public String toString() {
        return getId() + ". " + getFullName() + "; Department: " + getDepartment() + "; Salary: " + getSalary();
    }
}
