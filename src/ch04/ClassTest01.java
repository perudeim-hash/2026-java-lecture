package ch04;

public class ClassTest01 {
    public static void main(String[] args) {


        Student st = new Student();

        st.name = "azxc";
        st.age = 28;
        st.iq = 100;
        st.weight = 25.5;
        System.out.println(st.hashCode());
        System.out.println(st.name + " 이름 " + st.age + " 나이 " + st.iq + " 아이큐 " + st.weight + " 몸무게");

        Student st02 = new Student();

        st02.name = "azxc";
        st02.age = 28;
        st02.iq = 100;
        st02.weight = 25.5;
        System.out.println(st02.hashCode());
        System.out.println(st02.name + " 이름 " + st02.age + " 나이 " + st02.iq + " 아이큐 " + st02.weight + " 몸무게");


        Student st03 = st;

        st03.name= "azxc444";
        System.out.println(System.identityHashCode(st03));
        System.out.println(System.identityHashCode(st));

        System.out.println(st.name);

    }
}
