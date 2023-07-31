package aula8.triangle;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = 10;
        System.out.printf("Triangulo a: %.2f, b: %.2f e c: %.2f %n",a,b,c);
        System.out.println("Perimetro:");
        System.out.println(Triangle.perimeter(a, b, c));

        System.out.println("Semi Perimetro:");
        System.out.println(Triangle.semiperimeter(a, b, c) );

        System.out.println("Area:");
        System.out.println(Triangle.area(a, b, c) ) ;

        System.out.println("Altura A:");
        System.out.println(Triangle.height(a, Triangle.area(a, b, c)) );

        System.out.println("Altura B:");
        System.out.println(Triangle.height(b, Triangle.area(a, b, c)) );

        System.out.println("Altura C:");
        System.out.println(Triangle.height(b, Triangle.area(a, b, c)) );

        System.out.println("Angulos:");
        System.out.println(Arrays.toString(Triangle.angles(a, b, c)));

        System.out.println("Inradius:");
        System.out.println(Triangle.inradius(a, b, c) );

        System.out.println("Circle radius:");
        System.out.println(Triangle.circumradius(a, b, c) );

        System.out.println("Medians:");
        System.out.println(Arrays.toString(Triangle.medians(a, b, c)));

    }
}
