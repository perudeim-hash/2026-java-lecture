package review.static01;

public class DecoMain01 {
    public static void main(String[] args) {
        String str01 = "hello java";
        DecoUtil decoUtil = new DecoUtil();
        System.out.println(DecoUtil.deco(str01));


        // method 에도 static 를 쓸 수 있다.
        // 이 때 instance를 생성 해서 static method를 쓰는 경우는 거의 없다.
        // 보통 Class.staticMethod() 를 바로 사용한다.
        String decoStr02 = DecoUtil.deco("hello python");
        System.out.println(decoStr02);

    }

}
