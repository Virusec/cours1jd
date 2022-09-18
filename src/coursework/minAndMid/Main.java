package coursework.minAndMid;

public class Main {
//    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

//        Employee sss = new Employee("sss", 2, 2222);
//        Employee ddd = new Employee("ddd", 1, 1000);
//        employees[0] = sss;
//        employees[1] = ddd;

        addEmployee(employees, new Employee("Suhov Andrei Ivanovich", 2, 10_000));
        addEmployee(employees,new Employee("Kotov Pavel Ivanovich", 2, 80_000));
        addEmployee(employees, new Employee("Asimov Andrey Viktorovich", 3, 50_000));
        addEmployee(employees, new Employee("Brusilov Mihail Gennadievich", 1, 70_000));
        addEmployee(employees, new Employee("Shepin Ivan Ivanovich", 3, 80_000));
        addEmployee(employees, new Employee("Koromislov Konstantin Igorevich", 1, 90_000));
        addEmployee(employees, new Employee("Ivanov Ivan Ivanovich", 3,19_000));
        addEmployee(employees, new Employee("Kuzin Nikolai Nikolaevich", 4, 60_000));
        addEmployee(employees, new Employee("Manin Ilya Evgenyevich", 1, 120_000));
        addEmployee(employees, new Employee("Petrov Petr Petrovich", 1, 50_000));

        printSeparator();
        printSeparator();
        System.out.println("Basic difficulty");
        printSeparator();
        printAllEmployees(employees);
        printSeparator();
        System.out.println("The amount of salary costs per month is " + calculateEmployeeSalaries(employees));
        printSeparator();
        System.out.println("The minimum wage is " + findMinSalary(employees));
        printSeparator();
        System.out.println("The maximum wage is " + findMaxSalary(employees));
        printSeparator();
        System.out.println("The average value of salaries is " + calculateAverageSalary(employees));
        printSeparator();
        printNameAllEmployees(employees);
        printSeparator();
        printSeparator();
        System.out.println("Increased complexity");
        printSeparator();
        indexSalary(employees, 3);
        printAllEmployees(employees);
        printSeparator();
        printByDepartmentMinSalary(employees, 1);
        printSeparator();
        printByDepartmentMaxSalary(employees,3);
        printSeparator();
        System.out.println("The salary for the department is " + calculateByDepartmentSalary(employees, 1));
        printSeparator();
        System.out.println("The average salary for the department is " + calculateByDepartmentAverageSalary(employees, 1));
        printSeparator();
        indexByDepartmentSalary(employees, 15, 1);
        printByDepartmentEmployees(employees, 1);
        printSeparator();
        printEmployeesWithSalaryLessThen(employees, 30000);
        printSeparator();
        printAllEmployees(employees);
        printSeparator();
        printEmployeesWithSalaryMoreThen(employees, 106604);
        printSeparator();
        printSeparator();
    }

    public static void printEmployeesWithSalaryMoreThen(Employee[] employees, int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= value) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public static void printEmployeesWithSalaryLessThen(Employee[] employees, int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public static void printByDepartmentEmployees(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public static void indexByDepartmentSalary(Employee[] employees, int percent, int department) {
        double index = (1.0 * percent / 100) + 1;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary * index));
            }
        }
    }

    public static int calculateByDepartmentAverageSalary(Employee[] employees, int department) {
        int sum = calculateByDepartmentSalary(employees, department);
        int counter = 1;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                counter++;
            }
        }
        return sum/ counter;
    }

    public static int calculateByDepartmentSalary(Employee[] employees, int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static void printByDepartmentMinSalary(Employee[] employees, int department) {
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

    public static void printByDepartmentMaxSalary(Employee[] employees, int department) {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                int value = employee.getSalary();
                if (value > max) {
                    max = value;
                    name = employee.getEmployeeName();
                }
            }
        }
        System.out.println("The maximum salary in Department " + department + " for a " + name + " employee is " + max);
    }

    public static void indexSalary(Employee[] employees, int percent) {
        double index = (1.0 * percent / 100) + 1;
        for (Employee employee : employees) {
            if (employee != null) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary * index));
            }
        }
    }

    // ***********************Basic difficulty***********************

    public static void printNameAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    public static double calculateAverageSalary(Employee[] employees) {
        int counterEmployees = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counterEmployees++;
                sum += employee.getSalary();
            }
        }
        return 1.0 * sum / counterEmployees;
    }

    public static int findMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                int value = employees[i].getSalary();
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    public static int findMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                int value = employees[i].getSalary();
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    public static void printSeparator() {
        System.out.println("***************************************************");
    }

    public static void addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(String.join(" : ",
                        employee.getId() + " " + employee.getEmployeeName(),
                        String.valueOf(employee.getDepartment()),
                        String.valueOf(employee.getSalary())));
            }
        }
    }

    public static int calculateEmployeeSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
}
