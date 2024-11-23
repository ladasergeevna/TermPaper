//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Список сотрудников:");
        employees[0] = new Employee("Kotova Milena Sergeevna", 1, 135000);
        employees[1] = new Employee("Kosmicheskiy Sergey Vladimirovich", 1, 140000);
        employees[2] = new Employee("Chernyh Elena Aleksandrona", 2, 93000);
        employees[3] = new Employee("Igorev Fedor Eduardovich", 2, 100000);
        employees[4] = new Employee("Muzichenko Oksana Mihailovna", 3, 80000);
        employees[5] = new Employee("Burovay Olga Alekseevna", 3, 81000);
        employees[6] = new Employee("Pesochnikov Vitaliy Alexandrovich", 4, 94000);
        employees[7] = new Employee("Kolpanov Alexandr Vitalievich", 4, 95000);
        employees[8] = new Employee("Ponomareva Inna Semenovna", 5, 120000);
        employees[9] = new Employee("Petrova Galina Vladimirovna", 5, 129000);
        printAllEmployee();
        System.out.println();
        System.out.println("Сумма затрат на зп в месяц: " + getSumSalary() + " рублей");
        System.out.println("Данные о сотруднике с минимальной зп: " + getEmployeeWithMinSalaryByDepartment());
        System.out.println("Данные о сотруднике с максимальной зп: " + getEmployeeWithMaxSalaryByDepartment());
        System.out.println("Средняя зп: " + getAvarageSalary() + " рублей");

    }

    private static void printAllEmployee() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getId() + ". " + employee.getFullName() + "; Department: " + employee.getDepartment() + "; Salary: " + employee.getSalary());
        }

    }

    private static Employee getEmployeeWithMinSalaryByDepartment() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employeeWithMinSalary == null || employee.getSalary() <= employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee getEmployeeWithMaxSalaryByDepartment() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employeeWithMaxSalary == null || employee.getSalary() >= employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static float getSumSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    private static float getAvarageSalary() {
        float avarageSalary = 0;
        avarageSalary = getSumSalary() / employees.length;

        return avarageSalary;

    }
}
