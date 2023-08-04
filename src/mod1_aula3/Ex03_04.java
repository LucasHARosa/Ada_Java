package mod1_aula3;

public class Ex03_04 {

    public static int primeiroCaractereUnico(String input) {
        int[] frequencia = new int[256];


        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            frequencia[caractere]++;
        }


        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (frequencia[caractere] == 1) {
                return i;
            }
        }


        return -1;
    }

}
