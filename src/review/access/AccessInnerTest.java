package review.access;

public class AccessInnerTest {
    public static void main(String[] args) {

        AccessData accessData = new AccessData();


        accessData.publicField = 1;
        accessData.publicMethod();

        accessData.defaultField = 2;
        accessData.defaultMethod();


        accessData.innerAccess();
    }
}
