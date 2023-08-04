package mod1_aula7;
import java.util.ArrayList;
import java.util.List;
public class Ex07_LMS02 {
    public static void main(String[] args) {
        System.out.println(geraSequenciaFibonacci(8));
    }
    public static String geraSequenciaFibonacci(int input) {
        if (numeroPertenceASequenciaFibonacci(input) == false) {
            return "0";
        }

        List<Integer> sequence = new ArrayList<>();
        int a = 0;
        int b = 1;

        while (a <= input) {
            sequence.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return sequence.toString();
    }
    public static boolean numeroPertenceASequenciaFibonacci(int input){
        if(input <= 0){
            return false;
        }
        return true;
    }
}
