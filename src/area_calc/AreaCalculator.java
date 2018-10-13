import java.util.Scanner;
public class AreaCalculator {
    private static double ask(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

  private static void rectangle(Scanner scanner) {
        double length = ask(scanner, "Please enter the length of the rectangle: ");
        double width = ask(scanner, "Please enter the width of the rectangle: ");
        System.out.println(length * width);
    }

    private static void square(Scanner scanner) {
        double lengthOfASide = ask(scanner, "Please enter the length of a side: ");
        System.out.println(lengthOfASide * lengthOfASide);
    }

    private static void triangle(Scanner scanner) {
        double triangleBase = ask(scanner, "Please enter the base of the triangle: ");
        double triangleHeight = ask(scanner, "Please enter the height of the triangle: ");
        System.out.println(0.5 * triangleBase * triangleHeight);
    }

    private static void circle(Scanner scanner) {
        double radius = ask(scanner, "Please enter the radius of the circle: ");
        System.out.println(2* Math.PI * radius);
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator! " +
            "Enter 1 to find the area of a Rectangle, " +
            "Enter 2 to find the area of a Square, " +
            "Enter 3 to find the area of a Triangle or " +
            "Enter 4 to find the circumference of a Circle");


        switch (scanner.nextInt()) {          
          case 1:
            rectangle(scanner);
            break;
          case 2:
            square(scanner);
            break;
          case 3:
            triangle(scanner);
            break;
          case 4:
            circle(scanner);
            break;

}
}
}