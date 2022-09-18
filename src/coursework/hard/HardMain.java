package coursework.hard;

public class HardMain {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Suhov Andrei Ivanovich", 2, 10_000));
        employeeBook.addEmployee(new Employee("Kotov Pavel Ivanovich", 2, 80_000));
        employeeBook.addEmployee(new Employee("Asimov Andrey Viktorovich", 3, 50_000));
        employeeBook.addEmployee(new Employee("Brusilov Mihail Gennadievich", 1, 70_000));
        employeeBook.addEmployee(new Employee("Shepin Ivan Ivanovich", 3, 80_000));
        employeeBook.addEmployee(new Employee("Koromislov Konstantin Igorevich", 1, 90_000));
        employeeBook.addEmployee(new Employee("Ivanov Ivan Ivanovich", 3,19_000));
        employeeBook.addEmployee(new Employee("Kuzin Nikolai Nikolaevich", 4, 60_000));
        employeeBook.addEmployee(new Employee("Manin Ilya Evgenyevich", 1, 120_000));
        employeeBook.addEmployee(new Employee("Petrov Petr Petrovich", 1, 50_000));

        employeeBook.deleteEmployeeById(1);
        employeeBook.printAllEmployees();
        printSeparator();
        employeeBook.deleteEmployeeByName("Kuzin Nikolai Nikolaevich");
        employeeBook.printAllEmployees();
        printSeparator();
        employeeBook.changeSalaryByName("Petrov Petr Petrovich", 100_000);
        employeeBook.printAllEmployees();
        printSeparator();
        employeeBook.changeDepartmentByName("Petrov Petr Petrovich", 5);
        employeeBook.printAllEmployees();
        printSeparator();
        employeeBook.printEmployeesByDepartment();
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("**********************************");
    }
}


