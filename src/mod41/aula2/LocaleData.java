package mod41.aula2;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class LocaleData {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZoneId zonaNovaYork = ZoneId.of("America/New_York");
        ZoneId zonaParis = ZoneId.of("Europe/Paris");
        ZoneId zonaToquio = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTimeNovaYork = zonedDateTime.withZoneSameInstant(zonaNovaYork);
        ZonedDateTime zonedDateTimeParis = zonedDateTime.withZoneSameInstant(zonaParis);
        ZonedDateTime zonedDateTimeToquio = zonedDateTime.withZoneSameInstant(zonaToquio);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Hora em São Paulo: " + zonedDateTime.format(formatter));
        System.out.println("Hora em Nova York: " + zonedDateTimeNovaYork.format(formatter));
        System.out.println("Hora em Paris: " + zonedDateTimeParis.format(formatter));
        System.out.println("Hora em Tóquio: " + zonedDateTimeToquio.format(formatter));
    }
}
