package Employee;

public class displayEmployeeDetails {
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails("Asif", 21, 100000);

        System.out.println(employee.getEmployeeDetails());
        employee.setName("Nayan");
        System.out.println(employee.getEmployeeDetails());
    }
}
