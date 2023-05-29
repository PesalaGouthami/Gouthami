package gouthami;
import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        System.out.println("1.circle");
        System.out.println("2.rectangle");
        Scanner s = new Scanner(System.in);
        System.out.println("enter your choice");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter radius");
                int radius=s.nextInt();
                double area=circle(radius);
                System.out.println("area of circle"+area);
                break;
            case 2:
                System.out.println("enter length");
                int length=s.nextInt();
                System.out.println("enter breadth");
                int breadth=s.nextInt();
                double area1= rectangle(length,breadth);
                System.out.println("area of rectangle"+area1);
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public static double circle (int radius ) {
        double c = 3.14 * radius * radius;
        return c;
    }
        public  static double rectangle (int length, int breadth){
        double r=length*breadth;
        return r;
        }
}
