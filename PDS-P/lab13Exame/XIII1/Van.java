public class Van implements Product {

    private String code;
    private String descr;
    private int points;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String description() {
        return descr;
    }

    @Override
    public double points() {
        return points;
    }
    
    public Van(String code, String descr, int points) {
        this.code = code;
        this.descr = descr;
        this.points = points;
    }
}
