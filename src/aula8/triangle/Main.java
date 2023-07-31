package aula8.triangle;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = 10;
        System.out.printf("Triangulo a: %.2f, b: %.2f e c: %.2f %n",a,b,c);
        System.out.println("Perimetro:");
        System.out.println(Triangle.calculatePerimeter(a, b, c));
        System.out.println(25);
        System.out.println("Semi Perimetro:");
        System.out.println(Triangle.calculateSemiperimeter(a, b, c) );
        System.out.println(12.5);
        System.out.println("Area:");
        System.out.println(Triangle.calculateArea(a, b, c) ) ;
        System.out.println(24.21);
        System.out.println("Altura A:");
        System.out.println(Triangle.calculateHeight(a, Triangle.calculateArea(a, b, c)) );
        System.out.println(9.68);
        System.out.println("Altura B:");
        System.out.println(Triangle.calculateHeight(b, Triangle.calculateArea(a, b, c)) );
        System.out.println(4.84);
        System.out.println("Altura C:");
        System.out.println(Triangle.calculateHeight(b, Triangle.calculateArea(a, b, c)) );
        System.out.println(4.84);
        System.out.println("Angulos:");
        System.out.println(Arrays.toString(Triangle.calculateAngles(a, b, c)));
        System.out.println("28° 57' 18.09\", 75° 31' 20.96\", 75° 31' 20.96\"");
        System.out.println("Inradius:");
        System.out.println(Triangle.calculateInradius(a, b, c) );
        System.out.println(1.94);
        System.out.println("Circle radius:");
        System.out.println(Triangle.calculateCircumradius(a, b, c) );
        System.out.println(5.15);
        System.out.println("Medians:");
        System.out.println(Arrays.toString(Triangle.calculateMedians(a, b, c)));
        System.out.println("9.68, 6.12, 6.12");
    }
}
