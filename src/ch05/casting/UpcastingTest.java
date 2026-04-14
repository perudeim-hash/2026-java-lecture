package ch05.casting;

public class UpcastingTest {
    //업 캐스팅
    static void showInfo(Person person) {
        System.out.println(person.name);
        System.out.println(person.id);
        //다운 캐스팅

        //instanceof -> 타입을 결정한다.
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("=======================");
            System.out.println("grade : " + student.grade);
            System.out.println("department : " + student.department);
            System.out.println("=======================");
        } else if (person instanceof Researcher) {
            Researcher researcher = (Researcher) person;
            System.out.println("=======================");
            System.out.println("researcher.scholarship = " + researcher.scholarship);
            System.out.println("researcher.age = "  + researcher.age);
            System.out.println("=======================");
        }


    }
    public static void main(String[] args) {

        Student student = new Student("임꺽정");
        Researcher researcher = new Researcher("교수");
        student.id = "qawsed1111";
        student.grade = 3;
        student.department = "화학과";
        researcher.age = 19;
        researcher.scholarship = 10;
        showInfo(student);
        showInfo(researcher);

    }

}
