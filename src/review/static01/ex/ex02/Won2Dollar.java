package review.static01.ex.ex02;

public class Won2Dollar extends Converter {

    public Won2Dollar(double ratio) {
        this.ratio =ratio;
    }

    @Override
    protected double convert(double srs) {
        srs = srs / ratio;
        return srs;

    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}
