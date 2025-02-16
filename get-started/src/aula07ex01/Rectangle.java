package aula07ex01;

public record Rectangle(double height, double base) implements GeometricForm {
    @Override
    public double getArea() {
        return height * base;
    }
}
