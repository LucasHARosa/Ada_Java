package mod4.aula2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StringDatas {
    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");

        List<LocalDate> datas = new ArrayList<>();
        for (String dataString : datasStrings) {
            LocalDate data = LocalDate.parse(dataString);
            datas.add(data);
        }

        for (LocalDate data : datas) {
            System.out.println(data.plusMonths(1));
        }
    }
}
