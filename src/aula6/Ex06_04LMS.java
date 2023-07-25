package aula6;
import java.util.HashMap;
import java.util.Map;
public class Ex06_04LMS {
    public static int numeroUnico( int[] input) {

        Map<Integer, Integer> occurrenceMap = new HashMap<>();


        for (int num : input) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
