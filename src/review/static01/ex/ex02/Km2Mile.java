package review.static01.ex.ex02;

public class Km2Mile extends Converter {

    public Km2Mile(double ratio) {
        this.ratio =ratio;
    }

    @Override
    protected double convert(double srs) {
        srs = srs / ratio;
        return srs;

    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
