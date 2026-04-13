package ch05.Answer.Answer4;

public class Manager extends Employee{
    int bonus;
    int total = 0;

    void showSalary() {
        this.bonus = bonus;
        int total = salary + bonus;
        System.out.println(name + " 님의 월급은 : " + salary + "원 입니다." + " 보너스를 " + bonus + "원 만큼 받으셔서 총 월급은 : " + total + "원 입니다.");


    }



}
