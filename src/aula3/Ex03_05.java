package aula3;
import java.util.HashSet;
import java.util.Set;
public class Ex03_05 {

    public static boolean elementosRepetidos(double[] input) {
        Set<Double> conjunto = new HashSet<>();


        for (double valor : input) {

            if (conjunto.contains(valor)) {
                return true;
            }


            conjunto.add(valor);
        }


        return false;
    }
}
