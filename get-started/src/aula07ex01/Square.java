package aula07ex01;

public record Square(double side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}
