package AbstractPractice;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){

        this.base = base;
        this.height = height;
    }

    @Override
    public double Calculate() {
        return (base * height)/2;
    }
}
