public class Circle {
    private double r;
    private final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) throws IllegalAccessException {
        if (r<=0){
            throw new IllegalAccessException("Radius must be positive");
        }
        this.r = r;
    }
    public double getArea(){
        return pi*r*r;
    }
}
