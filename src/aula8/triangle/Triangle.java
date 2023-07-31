package aula8.triangle;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Triangle {



    private static double round(double numero, int decimals) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat();
        switch (decimals){
            case(1):
                decimalFormat = new DecimalFormat("#.#", symbols);
                break;
            case(2):
                decimalFormat = new DecimalFormat("#.##", symbols);
                break;
            case(3):
                decimalFormat = new DecimalFormat("#.###", symbols);
                break;
        }
        return Double.parseDouble(decimalFormat.format(numero));
    }

    private static String degressToString(double angle) {
        double degrees = Math.floor(angle);
        double decimalMinutes = (angle - degrees) * 60;
        double minutes = Math.floor(decimalMinutes);
        double seconds = (decimalMinutes - minutes) * 60;

        return String.format(String.format(Locale.US, "%.0f° %.0f' %.2f\"", degrees, minutes, seconds));
    }


    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateSemiperimeter(double a, double b, double c) {
        return calculatePerimeter(a, b, c)/2;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = calculateSemiperimeter(a, b, c);
        return round(Math.sqrt(s * (s - a) * (s - b) * (s - c)), 2);
    }

    public static double calculateArea(double a, double b, double c, int decimal) {
        double s = calculateSemiperimeter(a, b, c);
        return round(Math.sqrt(s * (s - a) * (s - b) * (s - c)), decimal);
    }

    public static double calculateHeight(double side, double area) {
        return round(2 * area / side, 2);
    }

    public static String[] calculateAngles(double a, double b, double c) {
        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        return new String[] {
                degressToString(Math.toDegrees(angleA)),
                degressToString(Math.toDegrees(angleB)),
                degressToString(Math.toDegrees(angleC))
        };
    }

    public static double calculateInradius(double a, double b, double c) {
        double s = calculateSemiperimeter(a, b, c);
        double area = calculateArea(a, b, c);
        return round(area / s, 2);
    }

    public static double calculateCircumradius(double a, double b, double c) {
        double area = calculateArea(a, b, c, 1);
        return (a * b * c) / (4*area);
    }

    public static double[] calculateMedians(double a, double b, double c) {
        double m1 = 0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a);
        double m2 = 0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b);
        double m3 = 0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
        return new double[] {round(m1, 2), round(m2, 2), round(m3, 2)};
    }




}
