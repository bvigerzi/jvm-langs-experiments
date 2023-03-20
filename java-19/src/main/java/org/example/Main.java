package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Wheeler");
        Point upperLeft = new Point(0,10);
        Point lowerRight = new Point(10, 0);
        ColouredPoint colouredUpperLeft = new ColouredPoint(upperLeft, Colour.BLUE);
        ColouredPoint colouredLowerRight = new ColouredPoint(lowerRight, Colour.GREEN);
        Rectangle rectangle = new Rectangle(colouredUpperLeft, colouredLowerRight);
        printName(person);
        printColourOfUpperLeftPoint(rectangle);
        printCoordsOfRectangle(rectangle);
    }

    static void printName(Object o) {
        if(o instanceof Person(String firstName, String lastName)) {
            System.out.println(firstName + " " + lastName);
        }
    }

    static void printColourOfUpperLeftPoint(Rectangle r) {
        if(r instanceof Rectangle(ColouredPoint(Point p, Colour c), ColouredPoint lr)) {
            System.out.println(c);
        }
    }

    static void printCoordsOfRectangle(Rectangle r) {
        if(r instanceof  Rectangle(ColouredPoint(Point(int x1, int y1), Colour c1), ColouredPoint(Point(int x2, int y2), Colour c2))) {
            System.out.printf("x1:%s,y1:%s x2:%s,y2:%s%n",x1,y1,x2,y2);
        }
    }
}
