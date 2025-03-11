package Stream.Employee;

public class EmployeeSalary {

    private final String employeeName;

    private final int salary;

    public EmployeeSalary(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
