package OOPs.intro.rectangle_and_point;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    Point topLeft;
    int height;
    int width;

    int getArea() {
        return (height * width);
    }

    int getPerimeter() {
        return 2 * (height + width);
    }

    Point getBottomRight() {
        int bottomRightX = topLeft.x + width;
        int bottomRightY = topLeft.y - height;
        return new Point(bottomRightX, bottomRightY);
    }
}

public class Main {

    public static void main(String[] args) {

        Point topLeft = new Point(0, 4);
        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 12;
        rectangle.topLeft = topLeft;
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter() + " " + rectangle.getBottomRight().x
                + " " + rectangle.getBottomRight().y);
    }

}
