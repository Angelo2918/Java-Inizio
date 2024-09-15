package TemeAbstraction;

abstract class Shape {

    abstract double rectangleArea(double length, double breadth);

    abstract double squareArea(double side);

    abstract double circleArea(double radius);
}

class Area extends Shape {
    @Override
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double squareArea(double side) {
        return side * side;

    }

    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
