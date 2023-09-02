package mod1.mod1_aula2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02_02 {
    public static void main(String[] args) {

        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        List<Integer> ascendingPar = filterAscendingPar(numbers);
        List<Integer> ascendingImpar = filterAscendingImpar(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(ascendingPar);
        System.out.println(ascendingImpar);



    }
    public static int[] sortAscendingOrder(int[] numbers){
        int[] array = numbers.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    public static int[] sortDescendingOrder(int[] numbers){
        int[] array = numbers.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static List<Integer> filterAscendingPar(int[] numbers){
        int[] array = sortAscendingOrder(numbers);
        List<Integer> numerosPares = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numerosPares.add(array[i]);
            }
        }
        return numerosPares;
    }

    public static List<Integer> filterAscendingImpar(int[] numbers){
        int[] array = sortAscendingOrder(numbers);
        List<Integer> numerosImpares = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                numerosImpares.add(array[i]);
            }
        }
        return numerosImpares;
    }
}
