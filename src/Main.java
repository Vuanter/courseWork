public class Main {

//1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//   a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//    b. Посчитать сумму затрат на зарплаты в месяц.
//    c. Найти сотрудника с минимальной зарплатой.
//    d. Найти сотрудника с максимальной зарплатой.
//    e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//    f. Получить Ф. И. О. всех сотрудников (вывести в консоль).


private static final Employee[] employee = new Employee[10];

public static void main(String[] args) {

    employee[0] = new Employee("Ivanov Ivan Ivanovich ", 30000, 1);
    employee[1] = new Employee("Petrov Petr Petrovich ", 38000, 3);
    employee[2] = new Employee("Vlasov Vladimir Vladimirovich ", 47000, 5);
    employee[3] = new Employee("Andreev Andrey Andreevich ", 35000, 1);
    employee[4] = new Employee("Danilov Danil Danilovich ", 81000, 4);
    employee[5] = new Employee("Putilov Yuri Yurievich ", 95000, 2);
    employee[6] = new Employee("Sergeev Sergey Sergeevich ", 100000, 5);
    employee[7] = new Employee("Semenov Semen Semenovich ", 59000, 3);
    employee[8] = new Employee("Nikolaev Nikolay Nikolaevich ", 75000, 2);
    employee[9] = new Employee("Fedorov Fedor Fedorovich ", 64000, 4);

    typeAllStaff();
    countMinSalary();
    countMaxSalary();
    System.out.println("Зарплата всех сотрудников в месяц " + countStaffSalary());
    System.out.println("Средняя зарплата " + averageSalary());
    countAllStaff();
}

    private static void typeAllStaff() {
        for (Employee employees : employee) {
            System.out.println(employees);
        }
    }

    private static void countMinSalary() {
        Employee min = employee[0];
        for (Employee employees : employee) {
            if (min.getSalaryStaff() > employees.getSalaryStaff()) {
                min = employees;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + min.getStaff() + ": " + min.getSalaryStaff());
    }

    private static void countMaxSalary() {
        Employee min = employee[0];
        for (Employee employees : employee) {
            if (min.getSalaryStaff() < employees.getSalaryStaff()) {
                min = employees;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + min.getStaff() + ": " + min.getSalaryStaff());
    }



    private static int countStaffSalary() {
        int sum = 0;
        for (Employee employee : employee) {
            sum += employee.getSalaryStaff();
        }
        return sum;
    }
    private static float averageSalary() {
        int sum = countStaffSalary();
        return (float) (sum / employee.length);
    }

    private static void countAllStaff() {
        for (Employee employee : employee) {
            System.out.println("Сотрудники " + employee.getStaff());
        }
    }
}

