package ch05.Answer.Answer4;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.name = "홍길동";
        manager.salary = 2000000;
        manager.bonus = 100000;

        manager.showSalary();
    }
}
