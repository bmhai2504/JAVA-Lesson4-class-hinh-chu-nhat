import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the width: ");
        double width = input.nextDouble();
        System.out.printf("Enter the height: ");
        double height = input.nextDouble();
        Rectangle myRect = new Rectangle(width, height);
        System.out.println("My Rect: " + myRect.display());
        System.out.println("Perimeter of my rect: " + myRect.getPerimeter());
        System.out.println("Area of my rect: " + myRect.getArea());
    }
}