public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Снежная Жанна", 1, 65_000);
        employees[1] = new Employee("Смирнов Сергей", 3, 100_000);
        employees[2] = new Employee("Иванов Иван", 2, 89_000);
        employees[3] = new Employee("Молев Дима", 4, 56_000);
        employees[4] = new Employee("Мусаев Мухаммед Ибрагим оглы", 1, 65_000);
        employees[5] = new Employee("Снежков Алексей", 2, 77_000);
        employees[6] = new Employee("Кабаева Алина", 4, 93_000);
        employees[7] = new Employee("Медведев Дима", 2, 68_000);
        employees[8] = new Employee("Пушкин Александр", 1, 98_000);
        employees[9] = new Employee("Святая Вероника", 3, 112_000);

        printAllEmployeesData(employees);


    }

    public static void printAllEmployeesData(Employee[] employees) { // Метод для печати данных всех сотрудников.
        for (Employee empl : employees) {
            System.out.println(empl);
        }
    }


    public static double calculateTotalSalaryExpenses(Employee[] employees) {
        // Метод для расчета общих затрат на зарплату.
        double totalSalary = 0;
        for (Employee empl : employees)// Цикл для прохода по массиву сотрудников.
        {
            totalSalary += empl.getSalary();
        }
        return totalSalary;
    }
    public static Employee findEmployeeWithMinSalary(Employee[] employees){
        // Метод для поиска сотрудника с минимальной зарплатой.
        int minSalaryEmployee = employees[0].getId();
        double minSalary = employees[0].getSalary(); // Переменная для хранения минимальной зарплаты.
        for(Employee empl)
        }

    }
}





