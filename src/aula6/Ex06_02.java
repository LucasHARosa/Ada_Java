package aula6;

public class Ex06_02 {
    public static boolean eUmTriangulo(int[] input) {
        if(!(input[0]+input[1]>input[2] && input[0]+input[2]>input[1] && input[1]+input[2]>input[0])){
            return false;
        }
        else{
            return true;
        }
    }
}
