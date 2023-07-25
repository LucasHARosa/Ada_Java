package aula6;

public class Ex06_01LMS {
    public static String mediaAproveitamento(double[] input) {
        double nota = (input[0] + (input[1]*2) + (input[2]*3) + input[3])/7;
        if (nota>=9){
            return "A";
        }else if( nota>=7.5 && nota<9){
            return "B";

        }else if(nota>=6 && nota<7.5){
            return "C";
        }else {
            return "D";
        }
    }
}
