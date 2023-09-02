package mod1.mod1_aula8.triangle;
import java.util.Locale;
public class Triangle {





    private static String degressToString(double angle) {
        double degrees = Math.floor(angle);
        double decimalMinutes = (angle - degrees) * 60;
        double minutes = Math.floor(decimalMinutes);
        double seconds = (decimalMinutes - minutes) * 60;

        return String.format(String.format(Locale.US, "%.0f° %.0f' %.2f\"", degrees, minutes, seconds));
    }


    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double semiperimeter(double a, double b, double c) {
        return perimeter(a, b, c)/2;
    }

    public static double area(double a, double b, double c) {
        double s = semiperimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double height(double side, double area) {
        return (2 * area / side);
    }

    public static String[] angles(double a, double b, double c) {
        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        return new String[] {
                degressToString(Math.toDegrees(angleA)),
                degressToString(Math.toDegrees(angleB)),
                degressToString(Math.toDegrees(angleC))
        };
    }

    public static double inradius(double a, double b, double c) {
        double s = semiperimeter(a, b, c);
        double area = area(a, b, c);
        return area / s;
    }

    public static double circumradius(double a, double b, double c) {
        double area = area(a, b, c);
        return (a * b * c) / (4*area);
    }

    public static double[] medians(double a, double b, double c) {
        double m1 = 0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a);
        double m2 = 0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b);
        double m3 = 0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
        return new double[] {m1, m2, m3};
    }




}
