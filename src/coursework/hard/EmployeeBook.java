package coursework.hard;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void printAllEmployeesListByDepartment() {
        for (int department = 1; department < 6; department++) {
            for (Employee employee : employees) {
                if (employee != null && department == employee.getDepartment()) {
                    System.out.println(employee.getDepartment() + " : " + employee.getEmployeeName());
                }
            }
        }
    }

    public void changeDepartmentByName(String employeeName, int department) {
        for (Employee employee : employees) {
            if (employee != null && employeeName.equals(employee.getEmployeeName())) {
                employee.setDepartment(department);
                System.out.println("Department of " + employeeName + " has been changed.");
                return;
            }
        }
        throw new IllegalArgumentException("This name " + employeeName + " does not exist.");
    }

    public void changeSalaryByName(String employeeName, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employeeName.equals(employee.getEmployeeName())) {
                employee.setSalary(salary);
                System.out.println("Salary of " + employeeName + " has been changed.");
                return;
            }
        }
        throw new IllegalArgumentException("This name " + employeeName + " does not exist.");
    }

    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employeeName.equals(employees[i].getEmployeeName())) {
                employees[i] = null;
                System.out.println("Employee " + employeeName + " has been removed.");
                return;
            }
        }
        throw new IllegalArgumentException("This name " + employeeName + " does not exist.");
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && id == employees[i].getId()) {
                employees[i] = null;
                System.out.println("Id " + id + " has been removed.");
                return;
            }
        }
        throw new IllegalArgumentException("This Id " + id + " does not exist.");
    }

    public void addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void printEmployeesWithSalaryMoreThen(int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= value) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public void printEmployeesWithSalaryLessThen(int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public void printByDepartmentEmployees(int department) {
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public void indexByDepartmentSalary(int percent, int department) {
        double index = (1.0 * percent / 100) + 1;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary * index));
            }
        }
    }

    public double calculateByDepartmentAverageSalary(int department) {
        int sum = calculateByDepartmentSalary(department);
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                counter++;
            }
        }
        return (double) sum/ counter;
    }

    public int calculateByDepartmentSalary(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void printByDepartmentMinSalary(int department) {
        int min = Integer.MAX_VALUE ;
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                int value = employees[i].getSalary();
                if (value < min || (i == 0)) {
                    min = value;
                    name = employees[i].getEmployeeName();
                }
            }
        }
        System.out.println("The minimum salary in Department " + department + " for a " + name + " employee is " + min);
    }

    public void printByDepartmentMaxSalary(int department) {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                int value = employees[i].getSalary();
                if (value > max) {
                    max = value;
                    name = employees[i].getEmployeeName();
                }
            }
        }
        System.out.println("The maximum salary in Department " + department + " for a " + name + " employee is " + max);
    }

    public void indexSalary(int percent) {
        double index = (1.0 * percent / 100) + 1;
        for (Employee employee : employees) {
            if (employee != null) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary * index));
            }
        }
    }

    public void printNameAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getDepartment()),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

}
