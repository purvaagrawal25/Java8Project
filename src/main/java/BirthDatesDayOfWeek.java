import java.time.LocalDate;
import java.util.List;

public class BirthDatesDayOfWeek {
    public static void main(String[] args) {

        for (int i = 1997; i <= 2020; i++) {
            LocalDate date = LocalDate.of(i, 3, 25);
           // List<String> dayOfWeek=date.toList();
            System.out.println(date.getDayOfWeek());
        }
    }
}
