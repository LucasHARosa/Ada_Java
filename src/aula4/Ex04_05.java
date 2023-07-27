package aula4;
import java.util.HashMap;
public class Ex04_05 {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static int primeiroCaractereUnico(String input) {
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();


        for (char c : input.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }


        for (int i = 0; i < input.length(); i++) {
            if (charFrequencyMap.get(input.charAt(i)) == 1) {
                return i; // Retorna Ex07_LMS02 posição do primeiro caractere único
            }
        }


        return -1;
    }
}
