package aula6;

public class Ex06_03LMS {
    public static int idadeEmDias( int[] input) {
        int anosDias = input[0]*365;
        int mesesDias = input[1]*30;
        int dias = anosDias + mesesDias + input[2];
        return dias;
    }
}
