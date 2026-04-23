package ch08.enumeration.answer.ex10;

public enum Calculate {
    PLUS,MINUS,MULTIPLY, DIVIDE,;
   private int total = 0;


    public int calculate (int a, int b) {
        switch (this) {
            case PLUS ->  total = a + b;
            case MINUS -> total = a - b;
            case MULTIPLY -> total = a * b;
            case DIVIDE -> total = a / b;
        }
        return this.total;
    }


}
