package mod1_aula8.triangle;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double a = 50;
        double b = 100;
        double c = 80;
        System.out.printf("Triangulo a: %.2f, b: %.2f e c: %.2f %n",a,b,c);
        System.out.printf("Perimetro: %.2f %n",Triangle.perimeter(a, b, c));

        System.out.printf("Semi Perimetro: %.2f %n", Triangle.semiperimeter(a, b, c));

        System.out.printf("Area: %.2f %n",Triangle.area(a, b, c) );

        System.out.printf("Altura A: %.2f %n",Triangle.height(a, Triangle.area(a, b, c)));

        System.out.printf("Altura B: %.2f %n",Triangle.height(b, Triangle.area(a, b, c)) );

        System.out.printf("Altura C: %.2f %n",Triangle.height(c, Triangle.area(a, b, c)) );


        System.out.println("Angulos:");
        System.out.println(Arrays.toString(Triangle.angles(a, b, c)));

        System.out.printf("Inradius: %.2f %n", Triangle.inradius(a, b, c));

        System.out.printf("Circle radius: %.2f %n",Triangle.circumradius(a, b, c));

        System.out.println("Medians:");
        System.out.println(Arrays.toString(Triangle.medians(a, b, c)));

    }
}
